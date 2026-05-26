package org.commonmark.node;

/**
 * Strong emphasis, e.g.:
 * <pre><code>
 * Some **strong emphasis** or __strong emphasis__
 * </code></pre>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#emphasis-and-strong-emphasis">CommonMark Spec: Emphasis and strong emphasis</a>
 */
public class StrongEmphasis extends Node implements Delimited {

    private String delimiter;

    public StrongEmphasis() {
    }

    public StrongEmphasis(String delimiter) {
        this.delimiter = delimiter;
    }

    public void setDelimiter(String delimiter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getOpeningDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getClosingDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
