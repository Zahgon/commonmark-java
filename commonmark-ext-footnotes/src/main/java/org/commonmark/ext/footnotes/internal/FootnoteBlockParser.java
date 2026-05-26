package org.commonmark.ext.footnotes.internal;

import org.commonmark.ext.footnotes.FootnoteDefinition;
import org.commonmark.node.Block;
import org.commonmark.node.DefinitionMap;
import org.commonmark.parser.block.*;
import org.commonmark.text.Characters;
import java.util.List;

/**
 * Parser for a single {@link FootnoteDefinition} block.
 */
public class FootnoteBlockParser extends AbstractBlockParser {

    private final FootnoteDefinition block;

    public FootnoteBlockParser(String label) {
        block = new FootnoteDefinition(label);
    }

    @Override
    public Block getBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
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
    public BlockContinue tryContinue(ParserState parserState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<DefinitionMap<?>> getDefinitions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Factory implements BlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
