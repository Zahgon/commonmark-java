package org.commonmark.node;

import java.util.ArrayList;
import java.util.List;

/**
 * A list of source spans that can be added to. Takes care of merging adjacent source spans.
 *
 * @since 0.16.0
 */
public class SourceSpans {

    private List<SourceSpan> sourceSpans;

    public static SourceSpans empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SourceSpan> getSourceSpans() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addAllFrom(Iterable<? extends Node> nodes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addAll(List<SourceSpan> other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
