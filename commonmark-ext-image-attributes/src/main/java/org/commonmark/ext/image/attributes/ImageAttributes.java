package org.commonmark.ext.image.attributes;

import org.commonmark.node.CustomNode;
import org.commonmark.node.Delimited;
import java.util.Map;

/**
 * A node containing text and other inline nodes as children.
 */
public class ImageAttributes extends CustomNode implements Delimited {

    private final Map<String, String> attributes;

    public ImageAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getOpeningDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getClosingDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, String> getAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected String toStringAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
