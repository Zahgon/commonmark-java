package org.commonmark.ext.gfm.alerts.internal;

import org.commonmark.ext.gfm.alerts.Alert;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import java.util.Set;

public abstract class AlertNodeRenderer implements NodeRenderer {

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void render(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract void renderAlert(Alert alert);
}
