package org.commonmark.internal.inline;

import org.commonmark.node.Code;
import org.commonmark.node.Text;
import org.commonmark.parser.SourceLines;
import org.commonmark.parser.beta.*;
import org.commonmark.text.Characters;
import java.util.Set;

/**
 * Attempt to parse backticks, returning either a backtick code span or a literal sequence of backticks.
 */
public class BackticksInlineParser implements InlineContentParser {

    @Override
    public ParsedInline tryParse(InlineParserState inlineParserState) {
        throw new UnsupportedOperationException("STUB: not implemented");
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
