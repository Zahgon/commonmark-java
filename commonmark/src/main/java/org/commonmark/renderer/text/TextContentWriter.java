package org.commonmark.renderer.text;

import java.io.IOException;
import java.util.LinkedList;

public class TextContentWriter {

    private final Appendable buffer;

    private final LineBreakRendering lineBreakRendering;

    private final LinkedList<String> prefixes = new LinkedList<>();

    private final LinkedList<Boolean> tight = new LinkedList<>();

    private String blockSeparator = null;

    private char lastChar;

    public TextContentWriter(Appendable out) {
        this(out, LineBreakRendering.COMPACT);
    }

    public TextContentWriter(Appendable out, LineBreakRendering lineBreakRendering) {
        this.buffer = out;
        this.lineBreakRendering = lineBreakRendering;
    }

    public void whitespace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void colon() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void line() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void block() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void resetBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void writeStripped(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void write(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void write(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Push a prefix onto the top of the stack. All prefixes are written at the beginning of each line, until the
     * prefix is popped again.
     *
     * @param prefix the raw prefix string
     */
    public void pushPrefix(String prefix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write a prefix.
     *
     * @param prefix the raw prefix string to write
     */
    public void writePrefix(String prefix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Remove the last prefix from the top of the stack.
     */
    public void popPrefix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Change whether blocks are tight or loose. Loose is the default where blocks are separated by a blank line. Tight
     * is where blocks are not separated by a blank line. Tight blocks are used in lists, if there are no blank lines
     * within the list.
     * <p>
     * Note that changing this does not affect block separators that have already been enqueued with {@link #block()},
     * only future ones.
     */
    public void pushTight(boolean tight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Remove the last "tight" setting from the top of the stack.
     */
    public void popTight() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isTight() {
        return !tight.isEmpty() && tight.getLast();
    }

    private void writePrefixes() {
        for (String prefix : prefixes) {
            append(prefix);
        }
    }

    /**
     * If a block separator has been enqueued with {@link #block()} but not yet written, write it now.
     */
    private void flushBlockSeparator() {
        if (blockSeparator != null) {
            if (blockSeparator.equals("\n") || blockSeparator.equals("\n\n")) {
                for (int i = 0; i < blockSeparator.length(); i++) {
                    var sep = blockSeparator.charAt(i);
                    append(sep);
                    writePrefixes();
                }
            } else {
                append(blockSeparator);
            }
            blockSeparator = null;
        }
    }

    private void append(String s) {
        try {
            buffer.append(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int length = s.length();
        if (length != 0) {
            lastChar = s.charAt(length - 1);
        }
    }

    private void append(char c) {
        try {
            buffer.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        lastChar = c;
    }
}
