package org.commonmark.ext.gfm.strikethrough.internal;

import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.node.Node;
import org.commonmark.renderer.markdown.MarkdownNodeRendererContext;
import org.commonmark.renderer.markdown.MarkdownWriter;

public class StrikethroughMarkdownNodeRenderer extends StrikethroughNodeRenderer {

    private final MarkdownNodeRendererContext context;

    private final MarkdownWriter writer;

    public StrikethroughMarkdownNodeRenderer(MarkdownNodeRendererContext context) {
        this.context = context;
        this.writer = context.getWriter();
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
