package org.commonmark.node;

/**
 * A thematic break, e.g. between text:
 * <pre>
 * Some text
 *
 * ___
 *
 * Some other text.
 * </pre>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#thematic-breaks">CommonMark Spec</a>
 */
public class ThematicBreak extends Block {

    private String literal;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the source literal that represents this node, if available
     */
    public String getLiteral() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLiteral(String literal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
