package org.commonmark.ext.ins;

import org.commonmark.Extension;
import org.commonmark.ext.ins.internal.InsDelimiterProcessor;
import org.commonmark.ext.ins.internal.InsHtmlNodeRenderer;
import org.commonmark.ext.ins.internal.InsMarkdownNodeRenderer;
import org.commonmark.ext.ins.internal.InsTextContentNodeRenderer;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.renderer.markdown.MarkdownNodeRendererContext;
import org.commonmark.renderer.markdown.MarkdownNodeRendererFactory;
import org.commonmark.renderer.markdown.MarkdownRenderer;
import org.commonmark.renderer.text.TextContentRenderer;
import java.util.Set;

/**
 * Extension for ins using ++
 * <p>
 * Create it with {@link #create()} and then configure it on the builders
 * ({@link org.commonmark.parser.Parser.Builder#extensions(Iterable)},
 * {@link HtmlRenderer.Builder#extensions(Iterable)}).
 * </p>
 * <p>
 * The parsed ins text regions are turned into {@link Ins} nodes.
 * </p>
 */
public class InsExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, TextContentRenderer.TextContentRendererExtension, MarkdownRenderer.MarkdownRendererExtension {

    private InsExtension() {
    }

    public static Extension create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void extend(Parser.Builder parserBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void extend(HtmlRenderer.Builder rendererBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void extend(TextContentRenderer.Builder rendererBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void extend(MarkdownRenderer.Builder rendererBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
