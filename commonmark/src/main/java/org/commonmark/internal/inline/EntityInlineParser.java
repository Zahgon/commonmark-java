package org.commonmark.internal.inline;

import org.commonmark.internal.util.Html5Entities;
import org.commonmark.node.Text;
import org.commonmark.parser.beta.*;
import org.commonmark.text.AsciiMatcher;
import java.util.Set;

/**
 * Attempts to parse an HTML entity or numeric character reference.
 */
public class EntityInlineParser implements InlineContentParser {

    private static final AsciiMatcher hex = AsciiMatcher.builder().range('0', '9').range('A', 'F').range('a', 'f').build();

    private static final AsciiMatcher dec = AsciiMatcher.builder().range('0', '9').build();

    private static final AsciiMatcher entityStart = AsciiMatcher.builder().range('A', 'Z').range('a', 'z').build();

    private static final AsciiMatcher entityContinue = entityStart.newBuilder().range('0', '9').build();

    @Override
    public ParsedInline tryParse(InlineParserState inlineParserState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private ParsedInline entity(Scanner scanner, Position start) {
        String text = scanner.getSource(start, scanner.position()).getContent();
        return ParsedInline.of(new Text(Html5Entities.entityToString(text)), scanner.position());
    }

    public static class Factory implements InlineContentParserFactory {

        @Override
        public Set<Character> getTriggerCharacters() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public InlineContentParser create() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
