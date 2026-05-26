package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.Document;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.ParserState;

public class DocumentBlockParser extends AbstractBlockParser {

    private final Document document = new Document();

    @Override
    public boolean isContainer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canContain(Block block) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Document getBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockContinue tryContinue(ParserState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
