package org.commonmark.ext.task.list.items.internal;

import org.commonmark.ext.task.list.items.TaskListItemMarker;
import org.commonmark.node.*;
import org.commonmark.parser.PostProcessor;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskListItemPostProcessor implements PostProcessor {

    private static final Pattern REGEX_TASK_LIST_ITEM = Pattern.compile("^\\[([xX\\s])]\\s+(.*)");

    @Override
    public Node process(Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class TaskListItemVisitor extends AbstractVisitor {

        @Override
        public void visit(ListItem listItem) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
