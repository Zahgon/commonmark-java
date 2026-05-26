package org.commonmark.node;

/**
 * An ordered list, e.g.:
 * <pre><code>
 * 1. One
 * 2. Two
 * 3. Three
 * </code></pre>
 * <p>
 * The children are {@link ListItem} blocks, which contain other blocks (or nested lists).
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#list-items">CommonMark Spec: List items</a>
 */
public class OrderedList extends ListBlock {

    private String markerDelimiter;

    private Integer markerStartNumber;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the start number used in the marker, e.g. {@code 1}, if available, or null otherwise
     */
    public Integer getMarkerStartNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMarkerStartNumber(Integer markerStartNumber) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the delimiter used in the marker, e.g. {@code .} or {@code )}, if available, or null otherwise
     */
    public String getMarkerDelimiter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMarkerDelimiter(String markerDelimiter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated use {@link #getMarkerStartNumber()} instead
     */
    @Deprecated
    public int getStartNumber() {
        return markerStartNumber != null ? markerStartNumber : 0;
    }

    /**
     * @deprecated use {@link #setMarkerStartNumber} instead
     */
    @Deprecated
    public void setStartNumber(int startNumber) {
        this.markerStartNumber = startNumber != 0 ? startNumber : null;
    }

    /**
     * @deprecated use {@link #getMarkerDelimiter()} instead
     */
    @Deprecated
    public char getDelimiter() {
        return markerDelimiter != null && !markerDelimiter.isEmpty() ? markerDelimiter.charAt(0) : '\0';
    }

    /**
     * @deprecated use {@link #setMarkerDelimiter} instead
     */
    @Deprecated
    public void setDelimiter(char delimiter) {
        this.markerDelimiter = delimiter != '\0' ? String.valueOf(delimiter) : null;
    }
}
