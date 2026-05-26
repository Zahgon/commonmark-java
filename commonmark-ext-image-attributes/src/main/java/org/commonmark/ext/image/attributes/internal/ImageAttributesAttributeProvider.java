package org.commonmark.ext.image.attributes.internal;

import org.commonmark.ext.image.attributes.ImageAttributes;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.CustomNode;
import org.commonmark.node.Image;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.AttributeProvider;
import java.util.*;

public class ImageAttributesAttributeProvider implements AttributeProvider {

    private ImageAttributesAttributeProvider() {
    }

    public static ImageAttributesAttributeProvider create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setAttributes(Node node, String tagName, final Map<String, String> attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
