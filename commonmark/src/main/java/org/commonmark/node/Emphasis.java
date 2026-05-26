package org.commonmark.node;

/**
 * Emphasis, e.g.:
 * <pre>
 * Some *emphasis* or _emphasis_
 * </pre>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#emphasis-and-strong-emphasis">CommonMark Spec: Emphasis and strong emphasis</a>
 */
public class Emphasis extends Node implements Delimited {

    private String delimiter;

    public Emphasis() {
    }

    public Emphasis(String delimiter) {
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
