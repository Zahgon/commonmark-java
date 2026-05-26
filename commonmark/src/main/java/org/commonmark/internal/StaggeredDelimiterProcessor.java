package org.commonmark.internal;

import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * An implementation of DelimiterProcessor that dispatches all calls to two or more other DelimiterProcessors
 * depending on the length of the delimiter run. All child DelimiterProcessors must have different minimum
 * lengths. A given delimiter run is dispatched to the child with the largest acceptable minimum length. If no
 * child is applicable, the one with the largest minimum length is chosen.
 */
class StaggeredDelimiterProcessor implements DelimiterProcessor {

    private final char delim;

    private int minLength = 0;

    // in reverse getMinLength order
    private LinkedList<DelimiterProcessor> processors = new LinkedList<>();

    StaggeredDelimiterProcessor(char delim) {
        this.delim = delim;
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

    void add(DelimiterProcessor dp) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private DelimiterProcessor findProcessor(int len) {
        for (DelimiterProcessor p : processors) {
            if (p.getMinLength() <= len) {
                return p;
            }
        }
        return processors.getFirst();
    }

    @Override
    public int process(DelimiterRun openingRun, DelimiterRun closingRun) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
