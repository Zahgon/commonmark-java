package org.commonmark.ext.task.list.items.internal;

import org.commonmark.ext.task.list.items.TaskListItemMarker;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TaskListItemHtmlNodeRenderer implements NodeRenderer {

    private final HtmlNodeRendererContext context;

    private final HtmlWriter html;

    public TaskListItemHtmlNodeRenderer(HtmlNodeRendererContext context) {
        this.context = context;
        this.html = context.getWriter();
    }

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
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
