package org.commonmark.internal;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.*;
import org.commonmark.text.Characters;
import static org.commonmark.internal.util.Escaping.unescapeString;

public class FencedCodeBlockParser extends AbstractBlockParser {

    private final FencedCodeBlock block = new FencedCodeBlock();

    private final char fenceChar;

    private final int openingFenceLength;

    private String firstLine;

    private StringBuilder otherLines = new StringBuilder();

    public FencedCodeBlockParser(char fenceChar, int fenceLength, int fenceIndent) {
        this.fenceChar = fenceChar;
        this.openingFenceLength = fenceLength;
        block.setFenceCharacter(String.valueOf(fenceChar));
        block.setOpeningFenceLength(fenceLength);
        block.setFenceIndent(fenceIndent);
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
    public void closeBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Factory extends AbstractBlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    // spec: A code fence is a sequence of at least three consecutive backtick characters (`) or tildes (~). (Tildes and
    // backticks cannot be mixed.)
    private static FencedCodeBlockParser checkOpener(CharSequence line, int index, int indent) {
        int backticks = 0;
        int tildes = 0;
        int length = line.length();
        loop: for (int i = index; i < length; i++) {
            switch(line.charAt(i)) {
                case '`':
                    backticks++;
                    break;
                case '~':
                    tildes++;
                    break;
                default:
                    break loop;
            }
        }
        if (backticks >= 3 && tildes == 0) {
            // spec: If the info string comes after a backtick fence, it may not contain any backtick characters.
            if (Characters.find('`', line, index + backticks) != -1) {
                return null;
            }
            return new FencedCodeBlockParser('`', backticks, indent);
        } else if (tildes >= 3 && backticks == 0) {
            // spec: Info strings for tilde code blocks can contain backticks and tildes
            return new FencedCodeBlockParser('~', tildes, indent);
        } else {
            return null;
        }
    }

    // spec: The content of the code block consists of all subsequent lines, until a closing code fence of the same type
    // as the code block began with (backticks or tildes), and with at least as many backticks or tildes as the opening
    // code fence.
    private boolean tryClosing(CharSequence line, int index) {
        int fences = Characters.skip(fenceChar, line, index, line.length()) - index;
        if (fences < openingFenceLength) {
            return false;
        }
        // spec: The closing code fence [...] may be followed only by spaces, which are ignored.
        int after = Characters.skipSpaceTab(line, index + fences, line.length());
        if (after == line.length()) {
            block.setClosingFenceLength(fences);
            return true;
        }
        return false;
    }
}
