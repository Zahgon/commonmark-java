package org.commonmark.internal.renderer;

import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeRendererMap {

    private final List<NodeRenderer> nodeRenderers = new ArrayList<>();

    private final Map<Class<? extends Node>, NodeRenderer> renderers = new HashMap<>(32);

    /**
     * Set the renderer for each {@link NodeRenderer#getNodeTypes()}, unless there was already a renderer set (first wins).
     */
    public void add(NodeRenderer nodeRenderer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void render(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void beforeRoot(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void afterRoot(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
