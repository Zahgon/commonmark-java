package org.commonmark.internal;

import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockStart;

public class BlockStartImpl extends BlockStart {

    private final BlockParser[] blockParsers;

    private int newIndex = -1;

    private int newColumn = -1;

    private boolean replaceActiveBlockParser = false;

    private int replaceParagraphLines = 0;

    public BlockStartImpl(BlockParser... blockParsers) {
        this.blockParsers = blockParsers;
    }

    public BlockParser[] getBlockParsers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNewIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNewColumn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isReplaceActiveBlockParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int getReplaceParagraphLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockStart atIndex(int newIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockStart atColumn(int newColumn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockStart replaceActiveBlockParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockStart replaceParagraphLines(int lines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
