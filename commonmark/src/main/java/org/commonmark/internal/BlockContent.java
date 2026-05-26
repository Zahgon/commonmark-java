package org.commonmark.internal;

class BlockContent {

    private final StringBuilder sb;

    private int lineCount = 0;

    public BlockContent() {
        sb = new StringBuilder();
    }

    public BlockContent(String content) {
        sb = new StringBuilder(content);
    }

    public void add(CharSequence line) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
