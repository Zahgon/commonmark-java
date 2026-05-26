package org.commonmark.ext.footnotes.internal;

import org.commonmark.ext.footnotes.FootnoteDefinition;
import org.commonmark.ext.footnotes.FootnoteReference;
import org.commonmark.ext.footnotes.InlineFootnote;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.beta.LinkInfo;
import org.commonmark.parser.beta.LinkProcessor;
import org.commonmark.parser.beta.LinkResult;
import org.commonmark.parser.beta.Scanner;

/**
 * For turning e.g. <code>[^foo]</code> into a {@link FootnoteReference},
 * and <code>^[foo]</code> into an {@link InlineFootnote}.
 */
public class FootnoteLinkProcessor implements LinkProcessor {

    @Override
    public LinkResult process(LinkInfo linkInfo, Scanner scanner, InlineParserContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
