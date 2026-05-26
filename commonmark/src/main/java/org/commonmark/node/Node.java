package org.commonmark.node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The base class of all CommonMark AST nodes ({@link Block} and inlines).
 * <p>
 * A node can have multiple children, and a parent (except for the root node).
 */
public abstract class Node {

    private Node parent = null;

    private Node firstChild = null;

    private Node lastChild = null;

    private Node prev = null;

    private Node next = null;

    private List<SourceSpan> sourceSpans = null;

    public abstract void accept(Visitor visitor);

    public Node getNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Node getPrevious() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Node getFirstChild() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Node getLastChild() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Node getParent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void setParent(Node parent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void appendChild(Node child) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void prependChild(Node child) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void unlink() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Inserts the {@code sibling} node after {@code this} node.
     */
    public void insertAfter(Node sibling) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Inserts the {@code sibling} node before {@code this} node.
     */
    public void insertBefore(Node sibling) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the source spans of this node if included by the parser, an empty list otherwise
     * @since 0.16.0
     */
    public List<SourceSpan> getSourceSpans() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Replace the current source spans with the provided list.
     *
     * @param sourceSpans the new source spans to set
     * @since 0.16.0
     */
    public void setSourceSpans(List<SourceSpan> sourceSpans) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Add a source span to the end of the list.
     *
     * @param sourceSpan the source span to add
     * @since 0.16.0
     */
    public void addSourceSpan(SourceSpan sourceSpan) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected String toStringAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
