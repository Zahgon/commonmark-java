package org.commonmark.ext.ins;

import org.commonmark.node.CustomNode;
import org.commonmark.node.Delimited;

/**
 * An ins node containing text and other inline nodes as children.
 */
public class Ins extends CustomNode implements Delimited {

    private static final String DELIMITER = "++";

    @Override
    public String getOpeningDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getClosingDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
