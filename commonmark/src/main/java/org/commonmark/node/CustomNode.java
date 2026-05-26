package org.commonmark.node;

/**
 * A node that extensions can subclass to define custom nodes (not part of the core specification).
 */
public abstract class CustomNode extends Node {

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
