package org.commonmark.node;

/**
 * A child of a {@link ListBlock}, containing other blocks (e.g. {@link Paragraph}, other lists, etc).
 * <p>
 * Note that a list item can't directly contain {@link Text}, it needs to be:
 * {@link ListItem} : {@link Paragraph} : {@link Text}.
 * If you want a list that is rendered tightly, create a list with {@link ListBlock#setTight(boolean)}.
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#list-items">CommonMark Spec: List items</a>
 */
public class ListItem extends Block {

    private Integer markerIndent;

    private Integer contentIndent;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the indent of the marker such as "-" or "1." in columns (spaces or tab stop of 4) if available, or null
     * otherwise.
     * <p>
     * Some examples and their marker indent:
     * <pre>- Foo</pre>
     * Marker indent: 0
     * <pre> - Foo</pre>
     * Marker indent: 1
     * <pre>  1. Foo</pre>
     * Marker indent: 2
     */
    public Integer getMarkerIndent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMarkerIndent(Integer markerIndent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the indent of the content in columns (spaces or tab stop of 4) if available, or null otherwise.
     * The content indent is counted from the beginning of the line and includes the marker on the first line.
     * <p>
     * Some examples and their content indent:
     * <pre>- Foo</pre>
     * Content indent: 2
     * <pre> - Foo</pre>
     * Content indent: 3
     * <pre>  1. Foo</pre>
     * Content indent: 5
     * <p>
     * Note that subsequent lines in the same list item need to be indented by at least the content indent to be counted
     * as part of the list item.
     */
    public Integer getContentIndent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setContentIndent(Integer contentIndent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated list items should only contain block nodes; if you're trying to create a list that is rendered
     * without paragraphs, use {@link ListBlock#setTight(boolean)} instead.
     */
    @Override
    @Deprecated
    public void appendChild(Node child) {
        super.appendChild(child);
    }

    public void appendChild(Block child) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
