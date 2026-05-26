package org.commonmark.ext.image.attributes.internal;

import org.commonmark.ext.image.attributes.ImageAttributes;
import org.commonmark.node.Image;
import org.commonmark.node.Node;
import org.commonmark.node.Nodes;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;
import java.util.*;

public class ImageAttributesDelimiterProcessor implements DelimiterProcessor {

    // Only allow a defined set of attributes to be used.
    private static final Set<String> SUPPORTED_ATTRIBUTES = Set.of("width", "height");

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
