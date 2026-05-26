package org.commonmark.parser.block;

import org.commonmark.node.Block;
import org.commonmark.node.DefinitionMap;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.SourceLine;
import java.util.List;

public abstract class AbstractBlockParser implements BlockParser {

    @Override
    public boolean isContainer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canHaveLazyContinuationLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canContain(Block childBlock) {
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
}
