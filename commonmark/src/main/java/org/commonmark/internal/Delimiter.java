package org.commonmark.internal;

import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterRun;
import java.util.List;

/**
 * Delimiter (emphasis, strong emphasis or custom emphasis).
 */
public class Delimiter implements DelimiterRun {

    public final List<Text> characters;

    public final char delimiterChar;

    private final int originalLength;

    // Can open emphasis, see spec.
    private final boolean canOpen;

    // Can close emphasis, see spec.
    private final boolean canClose;

    public Delimiter previous;

    public Delimiter next;

    public Delimiter(List<Text> characters, char delimiterChar, boolean canOpen, boolean canClose, Delimiter previous) {
        this.characters = characters;
        this.delimiterChar = delimiterChar;
        this.canOpen = canOpen;
        this.canClose = canClose;
        this.previous = previous;
        this.originalLength = characters.size();
    }

    @Override
    public boolean canOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int length() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int originalLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Text getOpener() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Text getCloser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterable<Text> getOpeners(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterable<Text> getClosers(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
