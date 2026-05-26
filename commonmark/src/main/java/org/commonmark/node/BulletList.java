package org.commonmark.node;

/**
 * A bullet list, e.g.:
 * <pre>
 * - One
 * - Two
 * - Three
 * </pre>
 * <p>
 * The children are {@link ListItem} blocks, which contain other blocks (or nested lists).
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#list-items">CommonMark Spec: List items</a>
 */
public class BulletList extends ListBlock {

    private String marker;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the bullet list marker that was used, e.g. {@code -}, {@code *} or {@code +}, if available, or null otherwise
     */
    public String getMarker() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMarker(String marker) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated use {@link #getMarker()} instead
     */
    @Deprecated
    public char getBulletMarker() {
        return marker != null && !marker.isEmpty() ? marker.charAt(0) : '\0';
    }

    /**
     * @deprecated use {@link #getMarker()} instead
     */
    @Deprecated
    public void setBulletMarker(char bulletMarker) {
        this.marker = bulletMarker != '\0' ? String.valueOf(bulletMarker) : null;
    }
}
