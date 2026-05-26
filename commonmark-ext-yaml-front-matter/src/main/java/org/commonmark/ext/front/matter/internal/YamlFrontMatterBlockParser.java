package org.commonmark.ext.front.matter.internal;

import org.commonmark.ext.front.matter.YamlFrontMatterBlock;
import org.commonmark.ext.front.matter.YamlFrontMatterNode;
import org.commonmark.node.Block;
import org.commonmark.node.Document;
import org.commonmark.parser.block.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YamlFrontMatterBlockParser extends AbstractBlockParser {

    private static final Pattern REGEX_METADATA = Pattern.compile("^[ ]{0,3}([A-Za-z0-9._-]+):\\s*(.*)");

    private static final Pattern REGEX_METADATA_LIST = Pattern.compile("^[ ]+-\\s*(.*)");

    private static final Pattern REGEX_METADATA_LITERAL = Pattern.compile("^\\s*(.*)");

    private static final Pattern REGEX_BEGIN = Pattern.compile("^-{3}(\\s.*)?");

    private static final Pattern REGEX_END = Pattern.compile("^(-{3}|\\.{3})(\\s.*)?");

    private boolean inLiteral;

    private String currentKey;

    private List<String> currentValues;

    private YamlFrontMatterBlock block;

    public YamlFrontMatterBlockParser() {
        inLiteral = false;
        currentKey = null;
        currentValues = new ArrayList<>();
        block = new YamlFrontMatterBlock();
    }

    @Override
    public Block getBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String parseString(String s) {
        // Limited parsing of https://yaml.org/spec/1.2.2/#73-flow-scalar-styles
        // We assume input is well-formed and otherwise treat it as a plain string. In a real
        // parser, e.g. `'foo` would be invalid because it's missing a trailing `'`.
        if (s.startsWith("'") && s.endsWith("'")) {
            String inner = s.substring(1, s.length() - 1);
            return inner.replace("''", "'");
        } else if (s.startsWith("\"") && s.endsWith("\"")) {
            String inner = s.substring(1, s.length() - 1);
            // Only support escaped `\` and `"`, nothing else.
            return inner.replace("\\\"", "\"").replace("\\\\", "\\");
        } else {
            return s;
        }
    }

    public static class Factory extends AbstractBlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
