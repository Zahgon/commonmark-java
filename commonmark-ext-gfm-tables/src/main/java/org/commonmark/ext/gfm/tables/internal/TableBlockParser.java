package org.commonmark.ext.gfm.tables.internal;

import org.commonmark.ext.gfm.tables.*;
import org.commonmark.node.Block;
import org.commonmark.node.Node;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.block.*;
import org.commonmark.text.Characters;
import java.util.ArrayList;
import java.util.List;

public class TableBlockParser extends AbstractBlockParser {

    private final TableBlock block = new TableBlock();

    private final List<SourceLine> rowLines = new ArrayList<>();

    private final List<TableCellInfo> columns;

    private boolean canHaveLazyContinuationLines = true;

    private TableBlockParser(List<TableCellInfo> columns, SourceLine headerLine) {
        this.columns = columns;
        this.rowLines.add(headerLine);
    }

    @Override
    public boolean canHaveLazyContinuationLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Block getBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockContinue tryContinue(ParserState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void addLine(SourceLine line) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void parseInlines(InlineParser inlineParser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private TableCell parseCell(SourceLine cell, int column, InlineParser inlineParser) {
        TableCell tableCell = new TableCell();
        SourceSpan sourceSpan = cell.getSourceSpan();
        if (sourceSpan != null) {
            tableCell.addSourceSpan(sourceSpan);
        }
        if (column < columns.size()) {
            TableCellInfo cellInfo = columns.get(column);
            tableCell.setAlignment(cellInfo.getAlignment());
            tableCell.setWidth(cellInfo.getWidth());
        }
        CharSequence content = cell.getContent();
        int start = Characters.skipSpaceTab(content, 0, content.length());
        int end = Characters.skipSpaceTabBackwards(content, content.length() - 1, start);
        inlineParser.parse(SourceLines.of(cell.substring(start, end + 1)), tableCell);
        return tableCell;
    }

    private static List<SourceLine> split(SourceLine line) {
        CharSequence row = line.getContent();
        int nonSpace = Characters.skipSpaceTab(row, 0, row.length());
        int cellStart = nonSpace;
        int cellEnd = row.length();
        if (row.charAt(nonSpace) == '|') {
            // This row has leading/trailing pipes - skip the leading pipe
            cellStart = nonSpace + 1;
            // Strip whitespace from the end but not the pipe or we could miss an empty ("||") cell
            int nonSpaceEnd = Characters.skipSpaceTabBackwards(row, row.length() - 1, cellStart);
            cellEnd = nonSpaceEnd + 1;
        }
        List<SourceLine> cells = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = cellStart; i < cellEnd; i++) {
            char c = row.charAt(i);
            switch(c) {
                case '\\':
                    if (i + 1 < cellEnd && row.charAt(i + 1) == '|') {
                        // Pipe is special for table parsing. An escaped pipe doesn't result in a new cell, but is
                        // passed down to inline parsing as an unescaped pipe. Note that that applies even for the `\|`
                        // in an input like `\\|` - in other words, table parsing doesn't support escaping backslashes.
                        sb.append('|');
                        i++;
                    } else {
                        // Preserve backslash before other characters or at end of line.
                        sb.append('\\');
                    }
                    break;
                case '|':
                    String content = sb.toString();
                    cells.add(SourceLine.of(content, line.substring(cellStart, i).getSourceSpan()));
                    sb.setLength(0);
                    // + 1 to skip the pipe itself for the next cell's span
                    cellStart = i + 1;
                    break;
                default:
                    sb.append(c);
            }
        }
        if (sb.length() > 0) {
            String content = sb.toString();
            cells.add(SourceLine.of(content, line.substring(cellStart, line.getContent().length()).getSourceSpan()));
        }
        return cells;
    }

    // Examples of valid separators:
    //
    // |-
    // -|
    // |-|
    // -|-
    // |-|-|
    // --- | ---
    private static List<TableCellInfo> parseSeparator(CharSequence s) {
        List<TableCellInfo> columns = new ArrayList<>();
        int pipes = 0;
        boolean valid = false;
        int i = 0;
        int width = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            switch(c) {
                case '|':
                    i++;
                    pipes++;
                    if (pipes > 1) {
                        // More than one adjacent pipe not allowed
                        return null;
                    }
                    // Need at lest one pipe, even for a one column table
                    valid = true;
                    break;
                case '-':
                case ':':
                    if (pipes == 0 && !columns.isEmpty()) {
                        // Need a pipe after the first column (first column doesn't need to start with one)
                        return null;
                    }
                    boolean left = false;
                    boolean right = false;
                    if (c == ':') {
                        left = true;
                        i++;
                        width++;
                    }
                    boolean haveDash = false;
                    while (i < s.length() && s.charAt(i) == '-') {
                        i++;
                        width++;
                        haveDash = true;
                    }
                    if (!haveDash) {
                        // Need at least one dash
                        return null;
                    }
                    if (i < s.length() && s.charAt(i) == ':') {
                        right = true;
                        i++;
                        width++;
                    }
                    columns.add(new TableCellInfo(getAlignment(left, right), width));
                    width = 0;
                    // Next, need another pipe
                    pipes = 0;
                    break;
                case ' ':
                case '\t':
                    // White space is allowed between pipes and columns
                    i++;
                    break;
                default:
                    // Any other character is invalid
                    return null;
            }
        }
        if (!valid) {
            return null;
        }
        return columns;
    }

    private static TableCell.Alignment getAlignment(boolean left, boolean right) {
        if (left && right) {
            return TableCell.Alignment.CENTER;
        } else if (left) {
            return TableCell.Alignment.LEFT;
        } else if (right) {
            return TableCell.Alignment.RIGHT;
        } else {
            return null;
        }
    }

    public static class Factory extends AbstractBlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private static class TableCellInfo {

        private final TableCell.Alignment alignment;

        private final int width;

        public TableCell.Alignment getAlignment() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getWidth() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public TableCellInfo(TableCell.Alignment alignment, int width) {
            this.alignment = alignment;
            this.width = width;
        }
    }
}
