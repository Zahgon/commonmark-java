package org.commonmark.node;

import java.util.Objects;

/**
 * A source span references a snippet of text from the source input.
 * <p>
 * It has a starting position (line and column index) and a length of how many characters it spans.
 * <p>
 * For example, this CommonMark source text:
 * <pre><code>
 * &gt; foo
 * </code></pre>
 * The {@link BlockQuote} node would have this source span: line 0, column 0, length 5.
 * <p>
 * The {@link Paragraph} node inside it would have: line 0, column 2, length 3.
 * <p>
 * If a block has multiple lines, it will have a source span for each line.
 * <p>
 * Note that the column index and length are measured in Java characters (UTF-16 code units). If you're outputting them
 * to be consumed by another programming language, e.g. one that uses UTF-8 strings, you will need to translate them,
 * otherwise characters such as emojis will result in incorrect positions.
 *
 * @since 0.16.0
 */
public class SourceSpan {

    private final int lineIndex;

    private final int columnIndex;

    private final int inputIndex;

    private final int length;

    public static SourceSpan of(int line, int col, int input, int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated Use {{@link #of(int, int, int, int)}} instead to also specify input index. Using the deprecated one
     * will set {@link #inputIndex} to 0.
     */
    @Deprecated
    public static SourceSpan of(int lineIndex, int columnIndex, int length) {
        return of(lineIndex, columnIndex, 0, length);
    }

    private SourceSpan(int lineIndex, int columnIndex, int inputIndex, int length) {
        if (lineIndex < 0) {
            throw new IllegalArgumentException("lineIndex " + lineIndex + " must be >= 0");
        }
        if (columnIndex < 0) {
            throw new IllegalArgumentException("columnIndex " + columnIndex + " must be >= 0");
        }
        if (inputIndex < 0) {
            throw new IllegalArgumentException("inputIndex " + inputIndex + " must be >= 0");
        }
        if (length < 0) {
            throw new IllegalArgumentException("length " + length + " must be >= 0");
        }
        this.lineIndex = lineIndex;
        this.columnIndex = columnIndex;
        this.inputIndex = inputIndex;
        this.length = length;
    }

    /**
     * @return 0-based line index, e.g. 0 for first line, 1 for the second line, etc
     */
    public int getLineIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return 0-based index of column (character on line) in source, e.g. 0 for the first character of a line, 1 for
     * the second character, etc
     */
    public int getColumnIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return 0-based index in whole input
     * @since 0.24.0
     */
    public int getInputIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return length of the span in characters
     */
    public int getLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SourceSpan subSpan(int beginIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SourceSpan subSpan(int beginIndex, int endIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
