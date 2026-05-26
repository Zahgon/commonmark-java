package org.commonmark.parser;

import org.commonmark.node.SourceSpan;
import java.util.Objects;

/**
 * A line or part of a line from the input source.
 *
 * @since 0.16.0
 */
public class SourceLine {

    private final CharSequence content;

    private final SourceSpan sourceSpan;

    public static SourceLine of(CharSequence content, SourceSpan sourceSpan) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private SourceLine(CharSequence content, SourceSpan sourceSpan) {
        this.content = Objects.requireNonNull(content, "content must not be null");
        this.sourceSpan = sourceSpan;
    }

    public CharSequence getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SourceSpan getSourceSpan() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SourceLine substring(int beginIndex, int endIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
