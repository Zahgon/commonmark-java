package org.commonmark.renderer.markdown;

import org.commonmark.node.*;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.text.AsciiMatcher;
import org.commonmark.text.CharMatcher;
import org.commonmark.text.Characters;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The node renderer that renders all the core nodes (comes last in the order of node renderers).
 * <p>
 * Note that while sometimes it would be easier to record what kind of syntax was used on parsing (e.g. ATX vs Setext
 * heading), this renderer is intended to also work for documents that were created by directly creating
 * {@link Node Nodes} instead. So in order to support that, it sometimes needs to do a bit more work.
 */
public class CoreMarkdownNodeRenderer extends AbstractVisitor implements NodeRenderer {

    private final AsciiMatcher textEscape;

    private final CharMatcher textEscapeInHeading;

    private final CharMatcher linkDestinationNeedsAngleBrackets = AsciiMatcher.builder().c(' ').c('(').c(')').c('<').c('>').c('\n').c('\\').build();

    private final CharMatcher linkDestinationEscapeInAngleBrackets = AsciiMatcher.builder().c('<').c('>').c('\n').c('\\').build();

    private final CharMatcher linkTitleEscapeInQuotes = AsciiMatcher.builder().c('"').c('\n').c('\\').build();

    private final Pattern orderedListMarkerPattern = Pattern.compile("^([0-9]{1,9})([.)])");

    protected final MarkdownNodeRendererContext context;

    private final MarkdownWriter writer;

    /**
     * If we're currently within a {@link BulletList} or {@link OrderedList}, this keeps the context of that list.
     * It has a parent field so that it can represent a stack (for nested lists).
     */
    private ListHolder listHolder;

    public CoreMarkdownNodeRenderer(MarkdownNodeRendererContext context) {
        this.context = context;
        this.writer = context.getWriter();
        textEscape = AsciiMatcher.builder().anyOf("[]<>`*_&\n\\").anyOf(context.getSpecialCharacters()).build();
        textEscapeInHeading = AsciiMatcher.builder(textEscape).anyOf("#").build();
    }

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void render(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Document document) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(ThematicBreak thematicBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Heading heading) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(IndentedCodeBlock indentedCodeBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(FencedCodeBlock codeBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HtmlBlock htmlBlock) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Paragraph paragraph) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(BlockQuote blockQuote) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(BulletList bulletList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(OrderedList orderedList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(ListItem listItem) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Code code) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Emphasis emphasis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(StrongEmphasis strongEmphasis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Link link) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Image image) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HtmlInline htmlInline) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(HardLineBreak hardLineBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(SoftLineBreak softLineBreak) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(Text text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void visitChildren(Node parent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int findMaxRunLength(String needle, String s) {
        int maxRunLength = 0;
        int pos = 0;
        while (pos < s.length()) {
            pos = s.indexOf(needle, pos);
            if (pos == -1) {
                return maxRunLength;
            }
            int runLength = 0;
            do {
                pos += needle.length();
                runLength++;
            } while (s.startsWith(needle, pos));
            maxRunLength = Math.max(runLength, maxRunLength);
        }
        return maxRunLength;
    }

    private static boolean contains(String s, CharMatcher charMatcher) {
        for (int i = 0; i < s.length(); i++) {
            if (charMatcher.matches(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Keep for Android compat (String.repeat only available on Android 12 and later)
    private static String repeat(String s, int count) {
        StringBuilder sb = new StringBuilder(s.length() * count);
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static List<String> getLines(String literal) {
        // Without -1, split would discard all trailing empty strings, which is not what we want, e.g. it would
        // return the same result for "abc", "abc\n" and "abc\n\n".
        // With -1, it returns ["abc"], ["abc", ""] and ["abc", "", ""].
        String[] parts = literal.split("\n", -1);
        if (parts[parts.length - 1].isEmpty()) {
            // But we don't want the last empty string, as "\n" is used as a line terminator (not a separator),
            // so return without the last element.
            return List.of(parts).subList(0, parts.length - 1);
        } else {
            return List.of(parts);
        }
    }

    private void writeLinkLike(String title, String destination, Node node, String opener) {
        writer.raw(opener);
        visitChildren(node);
        writer.raw(']');
        writer.raw('(');
        if (contains(destination, linkDestinationNeedsAngleBrackets)) {
            writer.raw('<');
            writer.text(destination, linkDestinationEscapeInAngleBrackets);
            writer.raw('>');
        } else {
            writer.raw(destination);
        }
        if (title != null) {
            writer.raw(' ');
            writer.raw('"');
            writer.text(title, linkTitleEscapeInQuotes);
            writer.raw('"');
        }
        writer.raw(')');
    }

    private static class ListHolder {

        final ListHolder parent;

        protected ListHolder(ListHolder parent) {
            this.parent = parent;
        }
    }

    private static class BulletListHolder extends ListHolder {

        final String marker;

        public BulletListHolder(ListHolder parent, BulletList bulletList) {
            super(parent);
            this.marker = bulletList.getMarker() != null ? bulletList.getMarker() : "-";
        }
    }

    private static class OrderedListHolder extends ListHolder {

        final String delimiter;

        private int number;

        protected OrderedListHolder(ListHolder parent, OrderedList orderedList) {
            super(parent);
            delimiter = orderedList.getMarkerDelimiter() != null ? orderedList.getMarkerDelimiter() : ".";
            number = orderedList.getMarkerStartNumber() != null ? orderedList.getMarkerStartNumber() : 1;
        }
    }

    /**
     * Visits nodes to check if there are any soft or hard line breaks.
     */
    private static class LineBreakVisitor extends AbstractVisitor {

        private boolean lineBreak = false;

        public boolean hasLineBreak() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void visit(SoftLineBreak softLineBreak) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void visit(HardLineBreak hardLineBreak) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
