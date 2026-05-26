package org.commonmark.ext.autolink;

import java.util.EnumSet;
import java.util.Set;
import org.commonmark.Extension;
import org.commonmark.ext.autolink.internal.AutolinkPostProcessor;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

/**
 * Extension for automatically turning plain URLs and email addresses into links.
 * <p>
 * Create it with {@link #create()} and then configure it on the builders
 * ({@link org.commonmark.parser.Parser.Builder#extensions(Iterable)},
 * {@link HtmlRenderer.Builder#extensions(Iterable)}).
 * </p>
 * <p>
 * The parsed links are turned into normal {@link org.commonmark.node.Link} nodes.
 * </p>
 */
public class AutolinkExtension implements Parser.ParserExtension {

    private final Set<AutolinkType> linkTypes;

    private AutolinkExtension(Builder builder) {
        this.linkTypes = builder.linkTypes;
    }

    /**
     * @return the extension with default options
     */
    public static Extension create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return a builder to configure the behavior of the extension.
     */
    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void extend(Parser.Builder parserBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private Set<AutolinkType> linkTypes = EnumSet.allOf(AutolinkType.class);

        /**
         * @param linkTypes the link types that should be converted. By default,
         *                  all {@link AutolinkType}s are converted.
         * @return {@code this}
         */
        public Builder linkTypes(AutolinkType... linkTypes) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * @param linkTypes the link types that should be converted. By default,
         *                  all {@link AutolinkType}s are converted.
         * @return {@code this}
         */
        public Builder linkTypes(Set<AutolinkType> linkTypes) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * @return a configured extension
         */
        public Extension build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
