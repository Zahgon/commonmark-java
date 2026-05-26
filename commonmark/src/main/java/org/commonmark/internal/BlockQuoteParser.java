package org.commonmark.internal;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.parser.block.*;
import org.commonmark.text.Characters;

public class BlockQuoteParser extends AbstractBlockParser {

    private final BlockQuote block = new BlockQuote();

    @Override
    public boolean isContainer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canContain(Block block) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockQuote getBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockContinue tryContinue(ParserState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isMarker(ParserState state, int index) {
        CharSequence line = state.getLine().getContent();
        return state.getIndent() < Parsing.CODE_BLOCK_INDENT && index < line.length() && line.charAt(index) == '>';
    }

    public static class Factory extends AbstractBlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
