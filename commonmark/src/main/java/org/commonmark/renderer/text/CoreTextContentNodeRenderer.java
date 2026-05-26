package org.commonmark.renderer.text;

import org.commonmark.node.*;
import org.commonmark.renderer.NodeRenderer;
import java.util.Set;

/**
 * The node renderer that renders all the core nodes (comes last in the order of node renderers).
 */
public class CoreTextContentNodeRenderer extends AbstractVisitor implements NodeRenderer {

    protected final TextContentNodeRendererContext context;

    private final TextContentWriter textContent;

    private ListHolder listHolder;

    public CoreTextContentNodeRenderer(TextContentNodeRendererContext context) {
        this.context = context;
        this.textContent = context.getWriter();
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
    public void visit(BlockQuote blockQuote) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(BulletList bulletList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Code code) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(FencedCodeBlock fencedCodeBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HardLineBreak hardLineBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Heading heading) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(ThematicBreak thematicBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HtmlInline htmlInline) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HtmlBlock htmlBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Image image) {
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
    public void visit(Paragraph paragraph) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(SoftLineBreak softLineBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Text text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void visitChildren(Node parent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void writeText(String text) {
        if (stripNewlines()) {
            textContent.writeStripped(text);
        } else {
            textContent.write(text);
        }
    }

    private void writeLink(Node node, String title, String destination) {
        boolean hasChild = node.getFirstChild() != null;
        boolean hasTitle = title != null && !title.equals(destination);
        boolean hasDestination = destination != null && !destination.isEmpty();
        if (hasChild) {
            textContent.write('"');
            visitChildren(node);
            textContent.write('"');
            if (hasTitle || hasDestination) {
                textContent.whitespace();
                textContent.write('(');
            }
        }
        if (hasTitle) {
            textContent.write(title);
            if (hasDestination) {
                textContent.colon();
                textContent.whitespace();
            }
        }
        if (hasDestination) {
            textContent.write(destination);
        }
        if (hasChild && (hasTitle || hasDestination)) {
            textContent.write(')');
        }
    }

    private boolean stripNewlines() {
        return context.lineBreakRendering() == LineBreakRendering.STRIP;
    }

    private static String stripTrailingNewline(String s) {
        if (s.endsWith("\n")) {
            return s.substring(0, s.length() - 1);
        } else {
            return s;
        }
    }

    // Keep for Android compat (String.repeat only available on Android 12 and later)
    private static String repeat(String s, int count) {
        var sb = new StringBuilder(s.length() * count);
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static class BulletListHolder extends ListHolder {

        private final String marker;

        public BulletListHolder(ListHolder parent, BulletList list) {
            super(parent);
            marker = list.getMarker();
        }

        public String getMarker() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private abstract static class ListHolder {

        private final ListHolder parent;

        ListHolder(ListHolder parent) {
            this.parent = parent;
        }

        public ListHolder getParent() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private static class OrderedListHolder extends ListHolder {

        private final String delimiter;

        private int counter;

        public OrderedListHolder(ListHolder parent, OrderedList list) {
            super(parent);
            delimiter = list.getMarkerDelimiter() != null ? list.getMarkerDelimiter() : ".";
            counter = list.getMarkerStartNumber() != null ? list.getMarkerStartNumber() : 1;
        }

        public String getDelimiter() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getCounter() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void increaseCounter() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
