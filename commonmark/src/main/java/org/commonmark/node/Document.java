package org.commonmark.node;

/**
 * The root block of a document, containing the top-level blocks.
 */
public class Document extends Block {

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
