package org.commonmark.parser.beta;

import org.commonmark.internal.inline.ParsedInlineImpl;
import org.commonmark.node.Node;
import java.util.Objects;

/**
 * The result of a single inline parser. Use the static methods to create instances.
 * <p>
 * <em>This interface is not intended to be implemented by clients.</em>
 */
public interface ParsedInline {

    static ParsedInline none() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static ParsedInline of(Node node, Position position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
