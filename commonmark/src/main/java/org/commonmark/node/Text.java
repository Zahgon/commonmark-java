package org.commonmark.node;

/**
 * A text node, e.g. in:
 * <pre>
 * foo *bar*
 * </pre>
 * <p>
 * The <code>foo </code> is a text node, and the <code>bar</code> inside the emphasis is also a text node.
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#textual-content">CommonMark Spec</a>
 */
public class Text extends Node {

    private String literal;

    public Text() {
    }

    public Text(String literal) {
        this.literal = literal;
    }

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLiteral() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLiteral(String literal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected String toStringAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
