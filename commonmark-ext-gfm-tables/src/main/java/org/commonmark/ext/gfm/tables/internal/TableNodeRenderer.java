package org.commonmark.ext.gfm.tables.internal;

import org.commonmark.ext.gfm.tables.*;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import java.util.Set;

abstract class TableNodeRenderer implements NodeRenderer {

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void render(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract void renderBlock(TableBlock node);

    protected abstract void renderHead(TableHead node);

    protected abstract void renderBody(TableBody node);

    protected abstract void renderRow(TableRow node);

    protected abstract void renderCell(TableCell node);
}
