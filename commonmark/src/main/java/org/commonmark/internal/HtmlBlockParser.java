package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.block.*;
import java.util.regex.Pattern;

public class HtmlBlockParser extends AbstractBlockParser {

    private static final String TAGNAME = "[A-Za-z][A-Za-z0-9-]*";

    private static final String ATTRIBUTENAME = "[a-zA-Z_:][a-zA-Z0-9:._-]*";

    private static final String UNQUOTEDVALUE = "[^\"'=<>`\\x00-\\x20]+";

    private static final String SINGLEQUOTEDVALUE = "'[^']*'";

    private static final String DOUBLEQUOTEDVALUE = "\"[^\"]*\"";

    private static final String ATTRIBUTEVALUE = "(?:" + UNQUOTEDVALUE + "|" + SINGLEQUOTEDVALUE + "|" + DOUBLEQUOTEDVALUE + ")";

    private static final String ATTRIBUTEVALUESPEC = "(?:" + "\\s*=" + "\\s*" + ATTRIBUTEVALUE + ")";

    private static final String ATTRIBUTE = "(?:" + "\\s+" + ATTRIBUTENAME + ATTRIBUTEVALUESPEC + "?)";

    private static final String OPENTAG = "<" + TAGNAME + ATTRIBUTE + "*" + "\\s*/?>";

    private static final String CLOSETAG = "</" + TAGNAME + "\\s*[>]";

    private static final Pattern[][] BLOCK_PATTERNS = new Pattern[][] { // not used (no type 0)
    { null, null }, { Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", Pattern.CASE_INSENSITIVE), Pattern.compile("</(?:script|pre|style|textarea)>", Pattern.CASE_INSENSITIVE) }, { Pattern.compile("^<!--"), Pattern.compile("-->") }, { Pattern.compile("^<[?]"), Pattern.compile("\\?>") }, { Pattern.compile("^<![A-Z]"), Pattern.compile(">") }, { Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>") }, { Pattern.compile("^</?(?:" + "address|article|aside|" + "base|basefont|blockquote|body|" + "caption|center|col|colgroup|" + "dd|details|dialog|dir|div|dl|dt|" + "fieldset|figcaption|figure|footer|form|frame|frameset|" + "h1|h2|h3|h4|h5|h6|head|header|hr|html|" + "iframe|" + "legend|li|link|" + "main|menu|menuitem|" + "nav|noframes|" + "ol|optgroup|option|" + "p|param|" + "search|section|summary|" + "table|tbody|td|tfoot|th|thead|title|tr|track|" + "ul" + ")(?:\\s|[/]?[>]|$)", Pattern.CASE_INSENSITIVE), // terminated by blank line
    null }, { Pattern.compile("^(?:" + OPENTAG + '|' + CLOSETAG + ")\\s*$", Pattern.CASE_INSENSITIVE), // terminated by blank line
    null } };

    private final HtmlBlock block = new HtmlBlock();

    private final Pattern closingPattern;

    private boolean finished = false;

    private BlockContent content = new BlockContent();

    private HtmlBlockParser(Pattern closingPattern) {
        this.closingPattern = closingPattern;
    }

    @Override
    public Block getBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BlockContinue tryContinue(ParserState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void addLine(SourceLine line) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void closeBlock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Factory extends AbstractBlockParserFactory {

        @Override
        public BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
