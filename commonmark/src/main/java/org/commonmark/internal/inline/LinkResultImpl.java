package org.commonmark.internal.inline;

import org.commonmark.node.Node;
import org.commonmark.parser.beta.LinkResult;
import org.commonmark.parser.beta.Position;

public class LinkResultImpl implements LinkResult {

    @Override
    public LinkResult includeMarker() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum Type {

        WRAP, REPLACE
    }

    private final Type type;

    private final Node node;

    private final Position position;

    private boolean includeMarker = false;

    public LinkResultImpl(Type type, Node node, Position position) {
        this.type = type;
        this.node = node;
        this.position = position;
    }

    public Type getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Node getNode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Position getPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIncludeMarker() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
