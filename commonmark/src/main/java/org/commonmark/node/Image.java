package org.commonmark.node;

/**
 * An image, e.g.:
 * <pre>
 * ![foo](/url "title")
 * </pre>
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#images">CommonMark Spec</a>
 */
public class Image extends Node {

    private String destination;

    private String title;

    public Image() {
    }

    public Image(String destination, String title) {
        this.destination = destination;
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDestination() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDestination(String destination) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTitle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTitle(String title) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected String toStringAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
