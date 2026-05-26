package org.commonmark.ext.front.matter;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.CustomNode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class YamlFrontMatterVisitor extends AbstractVisitor {

    private Map<String, List<String>> data;

    public YamlFrontMatterVisitor() {
        data = new LinkedHashMap<>();
    }

    @Override
    public void visit(CustomNode customNode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, List<String>> getData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
