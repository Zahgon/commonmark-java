package org.commonmark.node;

/**
 * Inline HTML element.
 *
 * @see <a href="http://spec.commonmark.org/0.31.2/#raw-html">CommonMark Spec</a>
 */
public class HtmlInline extends Node {

    private String literal;

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
}
