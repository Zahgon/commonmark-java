package org.commonmark.parser.beta;

import org.commonmark.node.SourceSpan;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import org.commonmark.text.CharMatcher;
import java.util.List;

public class Scanner {

    /**
     * Character representing the end of input source (or outside of the text in case of the "previous" methods).
     * <p>
     * Note that we can use NULL to represent this because CommonMark does not allow those in the input (we replace them
     * in the beginning of parsing).
     */
    public static final char END = '\0';

    // Lines without newlines at the end. The scanner will yield `\n` between lines because they're significant for
    // parsing and the final output. There is no `\n` after the last line.
    private final List<SourceLine> lines;

    // Which line we're at.
    private int lineIndex;

    // The index within the line. If index == length(), we pretend that there's a `\n` and only advance after we yield
    // that.
    private int index;

    // Current line or "" if at the end of the lines (using "" instead of null saves a null check)
    private SourceLine line = SourceLine.of("", null);

    private int lineLength = 0;

    Scanner(List<SourceLine> lines, int lineIndex, int index) {
        this.lines = lines;
        this.lineIndex = lineIndex;
        this.index = index;
        if (!lines.isEmpty()) {
            checkPosition(lineIndex, index);
            setLine(lines.get(lineIndex));
        }
    }

    public static Scanner of(SourceLines lines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public char peek() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int peekCodePoint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int peekPreviousCodePoint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check if the specified char is next and advance the position.
     *
     * @param c the char to check (including newline characters)
     * @return true if matched and position was advanced, false otherwise
     */
    public boolean next(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check if we have the specified content on the line and advanced the position. Note that if you want to match
     * newline characters, use {@link #next(char)}.
     *
     * @param content the text content to match on a single line (excluding newline characters)
     * @return true if matched and position was advanced, false otherwise
     */
    public boolean next(String content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int matchMultiple(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int match(CharMatcher matcher) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int whitespace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int find(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int find(CharMatcher matcher) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // Don't expose the int index, because it would be good if we could switch input to a List<String> of lines later
    // instead of one contiguous String.
    public Position position() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPosition(Position position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // For cases where the caller appends the result to a StringBuilder, we could offer another method to avoid some
    // unnecessary copying.
    public SourceLines getSource(Position begin, Position end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void setLine(SourceLine line) {
        this.line = line;
        this.lineLength = line.getContent().length();
    }

    private void checkPosition(int lineIndex, int index) {
        if (lineIndex < 0 || lineIndex >= lines.size()) {
            throw new IllegalArgumentException("Line index " + lineIndex + " out of range, number of lines: " + lines.size());
        }
        SourceLine line = lines.get(lineIndex);
        if (index < 0 || index > line.getContent().length()) {
            throw new IllegalArgumentException("Index " + index + " out of range, line length: " + line.getContent().length());
        }
    }
}
