package org.commonmark.ext.gfm.tables.internal;

import org.commonmark.ext.gfm.tables.*;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;
import java.util.Map;

public class TableHtmlNodeRenderer extends TableNodeRenderer {

    private final HtmlWriter htmlWriter;

    private final HtmlNodeRendererContext context;

    public TableHtmlNodeRenderer(HtmlNodeRendererContext context) {
        this.htmlWriter = context.getWriter();
        this.context = context;
    }

    @Override
    protected void renderBlock(TableBlock tableBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderHead(TableHead tableHead) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderBody(TableBody tableBody) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderRow(TableRow tableRow) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderCell(TableCell tableCell) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Map<String, String> getAttributes(Node node, String tagName) {
        return context.extendAttributes(node, tagName, Map.of());
    }

    private Map<String, String> getCellAttributes(TableCell tableCell, String tagName) {
        if (tableCell.getAlignment() != null) {
            return context.extendAttributes(tableCell, tagName, Map.of("align", getAlignValue(tableCell.getAlignment())));
        } else {
            return context.extendAttributes(tableCell, tagName, Map.of());
        }
    }

    private static String getAlignValue(TableCell.Alignment alignment) {
        switch(alignment) {
            case LEFT:
                return "left";
            case CENTER:
                return "center";
            case RIGHT:
                return "right";
        }
        throw new IllegalStateException("Unknown alignment: " + alignment);
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
