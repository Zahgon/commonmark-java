package org.commonmark.node;

/**
 * A heading, e.g.:
 * <pre>
 * First heading
 * =============
 *
 * ## Another heading
 * </pre>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#atx-headings">CommonMark Spec: ATX headings</a>
 * @see <a href="https://spec.commonmark.org/0.31.2/#setext-headings">CommonMark Spec: Setext headings</a>
 */
public class Heading extends Block {

    private int level;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getLevel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLevel(int level) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
