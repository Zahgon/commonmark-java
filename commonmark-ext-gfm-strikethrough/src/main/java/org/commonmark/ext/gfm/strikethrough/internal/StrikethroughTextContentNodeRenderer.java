package org.commonmark.ext.gfm.strikethrough.internal;

import org.commonmark.renderer.text.TextContentWriter;
import org.commonmark.renderer.text.TextContentNodeRendererContext;
import org.commonmark.node.Node;

public class StrikethroughTextContentNodeRenderer extends StrikethroughNodeRenderer {

    private final TextContentNodeRendererContext context;

    private final TextContentWriter textContent;

    public StrikethroughTextContentNodeRenderer(TextContentNodeRendererContext context) {
        this.context = context;
        this.textContent = context.getWriter();
    }

    @Override
    public void render(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void renderChildren(Node parent) {
        Node node = parent.getFirstChild();
        while (node != null) {
            Node next = node.getNext();
            context.render(node);
            node = next;
        }
    }
}
