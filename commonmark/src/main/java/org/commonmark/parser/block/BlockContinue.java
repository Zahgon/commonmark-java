package org.commonmark.parser.block;

import org.commonmark.internal.BlockContinueImpl;

/**
 * Result object for continuing parsing of a block, see static methods for constructors.
 */
public class BlockContinue {

    protected BlockContinue() {
    }

    public static BlockContinue none() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BlockContinue atIndex(int newIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BlockContinue atColumn(int newColumn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BlockContinue finished() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
