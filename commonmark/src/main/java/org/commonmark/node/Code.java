package org.commonmark.node;

/**
 * Inline code span, e.g.:
 * <pre>
 * Some `inline code`
 * </pre>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#code-spans">CommonMark Spec</a>
 */
public class Code extends Node {

    private String literal;

    public Code() {
    }

    public Code(String literal) {
        this.literal = literal;
    }

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the literal text in the code span (note that it's not necessarily the raw text between tildes,
     * e.g. when spaces are stripped)
     */
    public String getLiteral() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLiteral(String literal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
