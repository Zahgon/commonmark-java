package org.commonmark.node;

import java.util.Iterator;

/**
 * Utility class for working with multiple {@link Node}s.
 *
 * @since 0.16.0
 */
public class Nodes {

    private Nodes() {
    }

    /**
     * The nodes between (not including) start and end.
     */
    public static Iterable<Node> between(Node start, Node end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class NodeIterable implements Iterable<Node> {

        private final Node first;

        private final Node end;

        private NodeIterable(Node first, Node end) {
            this.first = first;
            this.end = end;
        }

        @Override
        public Iterator<Node> iterator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private static class NodeIterator implements Iterator<Node> {

        private Node node;

        private final Node end;

        private NodeIterator(Node first, Node end) {
            node = first;
            this.end = end;
        }

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Node next() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
