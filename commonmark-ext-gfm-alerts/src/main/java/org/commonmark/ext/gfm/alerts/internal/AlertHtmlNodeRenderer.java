package org.commonmark.ext.gfm.alerts.internal;

import org.commonmark.ext.gfm.alerts.Alert;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class AlertHtmlNodeRenderer extends AlertNodeRenderer {

    private final HtmlWriter htmlWriter;

    private final HtmlNodeRendererContext context;

    private final Map<String, String> customTypeTitles;

    public AlertHtmlNodeRenderer(HtmlNodeRendererContext context, Map<String, String> customTypeTitles) {
        this.htmlWriter = context.getWriter();
        this.context = context;
        this.customTypeTitles = customTypeTitles;
    }

    @Override
    protected void renderAlert(Alert alert) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getAlertTitle(String type) {
        var customTypeTitle = customTypeTitles.get(type);
        if (customTypeTitle != null) {
            return customTypeTitle;
        }
        switch(type) {
            case "NOTE":
                return "Note";
            case "TIP":
                return "Tip";
            case "IMPORTANT":
                return "Important";
            case "WARNING":
                return "Warning";
            case "CAUTION":
                return "Caution";
            default:
                throw new IllegalStateException("Unknown alert type: " + type);
        }
    }

    private void renderChildren(Node parent) {
        var node = parent.getFirstChild();
        while (node != null) {
            var next = node.getNext();
            context.render(node);
            node = next;
        }
    }
}
