package org.commonmark.internal;

import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.beta.LinkProcessor;
import org.commonmark.parser.beta.InlineContentParserFactory;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import java.util.List;
import java.util.Set;

public class InlineParserContextImpl implements InlineParserContext {

    private final List<InlineContentParserFactory> inlineContentParserFactories;

    private final List<DelimiterProcessor> delimiterProcessors;

    private final List<LinkProcessor> linkProcessors;

    private final Set<Character> linkMarkers;

    private final Definitions definitions;

    public InlineParserContextImpl(List<InlineContentParserFactory> inlineContentParserFactories, List<DelimiterProcessor> delimiterProcessors, List<LinkProcessor> linkProcessors, Set<Character> linkMarkers, Definitions definitions) {
        this.inlineContentParserFactories = inlineContentParserFactories;
        this.delimiterProcessors = delimiterProcessors;
        this.linkProcessors = linkProcessors;
        this.linkMarkers = linkMarkers;
        this.definitions = definitions;
    }

    @Override
    public List<InlineContentParserFactory> getCustomInlineContentParserFactories() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<DelimiterProcessor> getCustomDelimiterProcessors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<LinkProcessor> getCustomLinkProcessors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<Character> getCustomLinkMarkers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public LinkReferenceDefinition getLinkReferenceDefinition(String label) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <D> D getDefinition(Class<D> type, String label) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
