package org.commonmark.ext.gfm.strikethrough.internal;

import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.node.Node;
import org.commonmark.node.Nodes;
import org.commonmark.node.SourceSpans;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;

public class StrikethroughDelimiterProcessor implements DelimiterProcessor {

    private final boolean requireTwoTildes;

    public StrikethroughDelimiterProcessor() {
        this(false);
    }

    public StrikethroughDelimiterProcessor(boolean requireTwoTildes) {
        this.requireTwoTildes = requireTwoTildes;
    }

    @Override
    public char getOpeningCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public char getClosingCharacter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getMinLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int process(DelimiterRun openingRun, DelimiterRun closingRun) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
