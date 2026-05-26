package org.commonmark.internal;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.*;
import org.commonmark.text.Characters;
import java.util.ArrayList;
import java.util.List;

public class IndentedCodeBlockParser extends AbstractBlockParser {

    private final IndentedCodeBlock block = new IndentedCodeBlock();

    private final List<CharSequence> lines = new ArrayList<>();

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
    public void closeBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Factory extends AbstractBlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
