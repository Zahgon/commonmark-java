package org.commonmark.node;

/**
 * Abstract visitor that visits all children by default.
 * <p>
 * Can be used to only process certain nodes. If you override a method and want visiting to descend into children,
 * call {@link #visitChildren}.
 */
public abstract class AbstractVisitor implements Visitor {

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
    public void visit(Document document) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Emphasis emphasis) {
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
    public void visit(StrongEmphasis strongEmphasis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Text text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(LinkReferenceDefinition linkReferenceDefinition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(CustomBlock customBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(CustomNode customNode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Visit the child nodes.
     *
     * @param parent the parent node whose children should be visited
     */
    protected void visitChildren(Node parent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
