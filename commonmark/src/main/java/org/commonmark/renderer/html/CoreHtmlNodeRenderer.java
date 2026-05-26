package org.commonmark.renderer.html;

import org.commonmark.node.*;
import org.commonmark.renderer.NodeRenderer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * The node renderer that renders all the core nodes (comes last in the order of node renderers).
 */
public class CoreHtmlNodeRenderer extends AbstractVisitor implements NodeRenderer {

    protected final HtmlNodeRendererContext context;

    private final HtmlWriter html;

    public CoreHtmlNodeRenderer(HtmlNodeRendererContext context) {
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

    @Override
    public void visit(Document document) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Heading heading) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Paragraph paragraph) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(BlockQuote blockQuote) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(BulletList bulletList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(FencedCodeBlock fencedCodeBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HtmlBlock htmlBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(ThematicBreak thematicBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(IndentedCodeBlock indentedCodeBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Link link) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(ListItem listItem) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(OrderedList orderedList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Image image) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Emphasis emphasis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(StrongEmphasis strongEmphasis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Text text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Code code) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HtmlInline htmlInline) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(SoftLineBreak softLineBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HardLineBreak hardLineBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void visitChildren(Node parent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void renderCodeBlock(String literal, Node node, Map<String, String> attributes) {
        html.line();
        html.tag("pre", getAttrs(node, "pre"));
        html.tag("code", getAttrs(node, "code", attributes));
        html.text(literal);
        html.tag("/code");
        html.tag("/pre");
        html.line();
    }

    private void renderListBlock(ListBlock listBlock, String tagName, Map<String, String> attributes) {
        html.line();
        html.tag(tagName, attributes);
        html.line();
        visitChildren(listBlock);
        html.line();
        html.tag('/' + tagName);
        html.line();
    }

    private boolean isInTightList(Paragraph paragraph) {
        Node parent = paragraph.getParent();
        if (parent != null) {
            Node gramps = parent.getParent();
            if (gramps instanceof ListBlock) {
                ListBlock list = (ListBlock) gramps;
                return list.isTight();
            }
        }
        return false;
    }

    private Map<String, String> getAttrs(Node node, String tagName) {
        return getAttrs(node, tagName, Map.of());
    }

    private Map<String, String> getAttrs(Node node, String tagName, Map<String, String> defaultAttributes) {
        return context.extendAttributes(node, tagName, defaultAttributes);
    }

    private static class AltTextVisitor extends AbstractVisitor {

        private final StringBuilder sb = new StringBuilder();

        String getAltText() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void visit(Text text) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void visit(Code code) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void visit(SoftLineBreak softLineBreak) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void visit(HardLineBreak hardLineBreak) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
