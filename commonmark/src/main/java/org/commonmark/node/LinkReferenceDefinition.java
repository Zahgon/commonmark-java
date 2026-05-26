package org.commonmark.node;

/**
 * A link reference definition, e.g.:
 * <pre><code>
 * [foo]: /url "title"
 * </code></pre>
 * <p>
 * They can be referenced anywhere else in the document to produce a link using <code>[foo]</code>. The definitions
 * themselves are usually not rendered in the final output.
 *
 * @see <a href="https://spec.commonmark.org/0.31.2/#link-reference-definition">CommonMark Spec</a>
 */
public class LinkReferenceDefinition extends Block {

    private String label;

    private String destination;

    private String title;

    public LinkReferenceDefinition() {
    }

    public LinkReferenceDefinition(String label, String destination, String title) {
        this.label = label;
        this.destination = destination;
        this.title = title;
    }

    public String getLabel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLabel(String label) {
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
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
