package org.commonmark.text;

import java.util.BitSet;
import java.util.Set;

/**
 * Char matcher that can match ASCII characters efficiently.
 */
public class AsciiMatcher implements CharMatcher {

    private final BitSet set;

    private AsciiMatcher(Builder builder) {
        this.set = builder.set;
    }

    @Override
    public boolean matches(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Builder newBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Builder builder(AsciiMatcher matcher) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private final BitSet set;

        private Builder(BitSet set) {
            this.set = set;
        }

        public Builder c(char c) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder anyOf(String s) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder anyOf(Set<Character> characters) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder range(char from, char toInclusive) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public AsciiMatcher build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
