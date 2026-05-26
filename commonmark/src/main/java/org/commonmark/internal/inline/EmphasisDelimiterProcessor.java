package org.commonmark.internal.inline;

import org.commonmark.node.*;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;

public abstract class EmphasisDelimiterProcessor implements DelimiterProcessor {

    private final char delimiterChar;

    protected EmphasisDelimiterProcessor(char delimiterChar) {
        this.delimiterChar = delimiterChar;
    }

    @Override
    public char getOpeningCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public char getClosingCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getMinLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int process(DelimiterRun openingRun, DelimiterRun closingRun) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
