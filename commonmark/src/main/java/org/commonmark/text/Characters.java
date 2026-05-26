package org.commonmark.text;

/**
 * Functions for finding characters in strings or checking characters.
 */
public class Characters {

    public static int find(char c, CharSequence s, int startIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int findLineBreak(CharSequence s, int startIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @see <a href="https://spec.commonmark.org/0.31.2/#blank-line">blank line</a>
     */
    public static boolean isBlank(CharSequence s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean hasNonSpace(CharSequence s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isLetter(CharSequence s, int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isSpaceOrTab(CharSequence s, int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @see <a href="https://spec.commonmark.org/0.31.2/#unicode-punctuation-character">Unicode punctuation character</a>
     */
    public static boolean isPunctuationCodePoint(int codePoint) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Check whether the provided code point is a Unicode whitespace character as defined in the spec.
     *
     * @see <a href="https://spec.commonmark.org/0.31.2/#unicode-whitespace-character">Unicode whitespace character</a>
     */
    public static boolean isWhitespaceCodePoint(int codePoint) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int skip(char skip, CharSequence s, int startIndex, int endIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int skipBackwards(char skip, CharSequence s, int startIndex, int lastIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int skipSpaceTab(CharSequence s, int startIndex, int endIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int skipSpaceTabBackwards(CharSequence s, int startIndex, int lastIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
