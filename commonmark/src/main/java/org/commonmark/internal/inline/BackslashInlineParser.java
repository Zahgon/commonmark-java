package org.commonmark.internal.inline;

import org.commonmark.internal.util.Escaping;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Text;
import org.commonmark.parser.beta.*;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Parse a backslash-escaped special character, adding either the escaped  character, a hard line break
 * (if the backslash is followed by a newline), or a literal backslash to the block's children.
 */
public class BackslashInlineParser implements InlineContentParser {

    private static final Pattern ESCAPABLE = Pattern.compile('^' + Escaping.ESCAPABLE);

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
