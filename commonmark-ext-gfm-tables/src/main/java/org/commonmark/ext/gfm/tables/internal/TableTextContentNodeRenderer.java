package org.commonmark.ext.gfm.tables.internal;

import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.node.Node;
import org.commonmark.renderer.text.TextContentNodeRendererContext;
import org.commonmark.renderer.text.TextContentWriter;

/**
 * The Table node renderer that is needed for rendering GFM tables (GitHub Flavored Markdown) to text content.
 */
public class TableTextContentNodeRenderer extends TableNodeRenderer {

    private final TextContentWriter textContentWriter;

    private final TextContentNodeRendererContext context;

    public TableTextContentNodeRenderer(TextContentNodeRendererContext context) {
        this.textContentWriter = context.getWriter();
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

    private void renderChildren(Node parent) {
        Node node = parent.getFirstChild();
        while (node != null) {
            Node next = node.getNext();
            context.render(node);
            node = next;
        }
    }
}
