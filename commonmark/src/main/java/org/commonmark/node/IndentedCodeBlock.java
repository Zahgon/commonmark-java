package org.commonmark.node;

/**
 * An indented code block, e.g.:
 * <pre><code>
 * Code follows:
 *
 *     foo
 *     bar
 * </code></pre>
 * <p>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#indented-code-blocks">CommonMark Spec</a>
 */
public class IndentedCodeBlock extends Block {

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
