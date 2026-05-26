package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.ParserState;

public class ListItemParser extends AbstractBlockParser {

    private final ListItem block = new ListItem();

    /**
     * Minimum number of columns that the content has to be indented (relative to the containing block) to be part of
     * this list item.
     */
    private int contentIndent;

    private boolean hadBlankLine;

    public ListItemParser(int markerIndent, int contentIndent) {
        this.contentIndent = contentIndent;
        block.setMarkerIndent(markerIndent);
        block.setContentIndent(contentIndent);
    }

    @Override
    public boolean isContainer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canContain(Block childBlock) {
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
}
