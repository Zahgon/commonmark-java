package org.commonmark.node;

/**
 * HTML block
 *
 * @see <a href="http://spec.commonmark.org/0.31.2/#html-blocks">CommonMark Spec</a>
 */
public class HtmlBlock extends Block {

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
