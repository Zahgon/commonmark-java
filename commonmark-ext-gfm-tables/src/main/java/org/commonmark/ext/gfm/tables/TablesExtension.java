package org.commonmark.ext.gfm.tables;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.internal.TableBlockParser;
import org.commonmark.ext.gfm.tables.internal.TableHtmlNodeRenderer;
import org.commonmark.ext.gfm.tables.internal.TableMarkdownNodeRenderer;
import org.commonmark.ext.gfm.tables.internal.TableTextContentNodeRenderer;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.renderer.markdown.MarkdownNodeRendererContext;
import org.commonmark.renderer.markdown.MarkdownNodeRendererFactory;
import org.commonmark.renderer.markdown.MarkdownRenderer;
import org.commonmark.renderer.text.TextContentRenderer;
import java.util.Set;

/**
 * Extension for GFM tables using "|" pipes (GitHub Flavored Markdown).
 * <p>
 * Create it with {@link #create()} and then configure it on the builders
 * ({@link org.commonmark.parser.Parser.Builder#extensions(Iterable)},
 * {@link HtmlRenderer.Builder#extensions(Iterable)}).
 * </p>
 * <p>
 * The parsed tables are turned into {@link TableBlock} blocks.
 * </p>
 *
 * @see <a href="https://github.github.com/gfm/#tables-extension-">Tables (extension) in GitHub Flavored Markdown Spec</a>
 */
public class TablesExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, TextContentRenderer.TextContentRendererExtension, MarkdownRenderer.MarkdownRendererExtension {

    private TablesExtension() {
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
