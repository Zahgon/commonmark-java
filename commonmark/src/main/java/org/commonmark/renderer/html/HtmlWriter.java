package org.commonmark.renderer.html;

import org.commonmark.internal.util.Escaping;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class HtmlWriter {

    private static final Map<String, String> NO_ATTRIBUTES = Map.of();

    private final Appendable buffer;

    private char lastChar = 0;

    public HtmlWriter(Appendable out) {
        Objects.requireNonNull(out, "out must not be null");
        this.buffer = out;
    }

    public void raw(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void text(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void tag(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void tag(String name, Map<String, String> attrs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void tag(String name, Map<String, String> attrs, boolean voidElement) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void line() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void append(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
