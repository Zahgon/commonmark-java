package org.commonmark.node;

/**
 * Block nodes such as paragraphs, list blocks, code blocks etc.
 */
public abstract class Block extends Node {

    @Override
    public Block getParent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void setParent(Node parent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
