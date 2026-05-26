package org.commonmark.parser;

import org.commonmark.node.SourceSpan;
import java.util.ArrayList;
import java.util.List;

/**
 * A set of lines ({@link SourceLine}) from the input source.
 *
 * @since 0.16.0
 */
public class SourceLines {

    private final List<SourceLine> lines = new ArrayList<>();

    public static SourceLines empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static SourceLines of(SourceLine sourceLine) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static SourceLines of(List<SourceLine> sourceLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addLine(SourceLine sourceLine) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SourceLine> getLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SourceSpan> getSourceSpans() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
