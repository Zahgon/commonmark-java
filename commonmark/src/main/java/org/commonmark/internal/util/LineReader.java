package org.commonmark.internal.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

/**
 * Reads lines from a reader like {@link java.io.BufferedReader} but also returns the line terminators.
 * <p>
 * Line terminators can be either a line feed {@code "\n"}, carriage return {@code "\r"}, or a carriage return followed
 * by a line feed {@code "\r\n"}. Call {@link #getLineTerminator()} after {@link #readLine()} to obtain the
 * corresponding line terminator. If a stream has a line at the end without a terminator, {@link #getLineTerminator()}
 * returns {@code null}.
 */
public class LineReader implements Closeable {

    // Same as java.io.BufferedReader
    static final int CHAR_BUFFER_SIZE = 8192;

    static final int EXPECTED_LINE_LENGTH = 80;

    private Reader reader;

    private char[] cbuf;

    private int position = 0;

    private int limit = 0;

    private String lineTerminator = null;

    public LineReader(Reader reader) {
        this.reader = reader;
        this.cbuf = new char[CHAR_BUFFER_SIZE];
    }

    /**
     * Read a line of text.
     *
     * @return the line, or {@code null} when the end of the stream has been reached and no more lines can be read
     */
    public String readLine() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the line terminator of the last read line from {@link #readLine()}.
     *
     * @return {@code "\n"}, {@code "\r"}, {@code "\r\n"}, or {@code null}
     */
    public String getLineTerminator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void fill() throws IOException {
        int read;
        do {
            read = reader.read(cbuf, 0, cbuf.length);
        } while (read == 0);
        if (read > 0) {
            limit = read;
            position = 0;
        }
    }

    private String line(String line, String lineTerminator) {
        this.lineTerminator = lineTerminator;
        return line;
    }

    private String finish(StringBuilder sb, int start, int end) {
        int len = end - start;
        if (sb == null) {
            return new String(cbuf, start, len);
        } else {
            return sb.append(cbuf, start, len).toString();
        }
    }
}
