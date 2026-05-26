package org.commonmark.internal;

import org.commonmark.parser.block.BlockContinue;

public class BlockContinueImpl extends BlockContinue {

    private final int newIndex;

    private final int newColumn;

    private final boolean finalize;

    public BlockContinueImpl(int newIndex, int newColumn, boolean finalize) {
        this.newIndex = newIndex;
        this.newColumn = newColumn;
        this.finalize = finalize;
    }

    public int getNewIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNewColumn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isFinalize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
