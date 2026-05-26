package org.commonmark.internal;

import org.commonmark.node.*;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.ParserState;
import java.util.List;

public class ParagraphParser extends AbstractBlockParser {

    private final Paragraph block = new Paragraph();

    private final LinkReferenceDefinitionParser linkReferenceDefinitionParser = new LinkReferenceDefinitionParser();

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
    public void addSourceSpan(SourceSpan sourceSpan) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<DefinitionMap<?>> getDefinitions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void closeBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void parseInlines(InlineParser inlineParser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SourceLines getParagraphLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SourceSpan> removeLines(int lines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
