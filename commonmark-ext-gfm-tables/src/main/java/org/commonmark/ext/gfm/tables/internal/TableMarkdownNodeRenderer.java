package org.commonmark.ext.gfm.tables.internal;

import org.commonmark.ext.gfm.tables.*;
import org.commonmark.node.Node;
import org.commonmark.renderer.markdown.MarkdownNodeRendererContext;
import org.commonmark.renderer.markdown.MarkdownWriter;
import org.commonmark.text.AsciiMatcher;
import java.util.ArrayList;
import java.util.List;

/**
 * The Table node renderer that is needed for rendering GFM tables (GitHub Flavored Markdown) to text content.
 */
public class TableMarkdownNodeRenderer extends TableNodeRenderer {

    private final MarkdownWriter writer;

    private final MarkdownNodeRendererContext context;

    private final AsciiMatcher pipe = AsciiMatcher.builder().c('|').build();

    private final List<TableCell.Alignment> columns = new ArrayList<>();

    public TableMarkdownNodeRenderer(MarkdownNodeRendererContext context) {
        this.writer = context.getWriter();
        this.context = context;
    }

    @Override
    protected void renderBlock(TableBlock node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderHead(TableHead node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderBody(TableBody node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderRow(TableRow node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void renderCell(TableCell node) {
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
