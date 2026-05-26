package org.commonmark.ext.front.matter;

import org.commonmark.node.CustomNode;
import java.util.List;

public class YamlFrontMatterNode extends CustomNode {

    private String key;

    private List<String> values;

    public YamlFrontMatterNode(String key, List<String> values) {
        this.key = key;
        this.values = values;
    }

    public String getKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setKey(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setValues(List<String> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
