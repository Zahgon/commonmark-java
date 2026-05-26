package org.commonmark.internal.util;

import org.commonmark.parser.beta.Scanner;

public class LinkScanner {

    /**
     * Attempt to scan the contents of a link label (inside the brackets), stopping after the content or returning false.
     * The stopped position can bei either the closing {@code ]}, or the end of the line if the label continues on
     * the next line.
     */
    public static boolean scanLinkLabelContent(Scanner scanner) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Attempt to scan a link destination, stopping after the destination or returning false.
     */
    public static boolean scanLinkDestination(Scanner scanner) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean scanLinkTitle(Scanner scanner) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean scanLinkTitleContent(Scanner scanner, char endDelimiter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // spec: a nonempty sequence of characters that does not start with <, does not include ASCII space or control
    // characters, and includes parentheses only if (a) they are backslash-escaped or (b) they are part of a balanced
    // pair of unescaped parentheses
    private static boolean scanLinkDestinationWithBalancedParens(Scanner scanner) {
        int parens = 0;
        boolean empty = true;
        while (scanner.hasNext()) {
            char c = scanner.peek();
            switch(c) {
                case ' ':
                    return !empty;
                case '\\':
                    scanner.next();
                    if (isEscapable(scanner.peek())) {
                        scanner.next();
                    }
                    break;
                case '(':
                    parens++;
                    // Limit to 32 nested parens for pathological cases
                    if (parens > 32) {
                        return false;
                    }
                    scanner.next();
                    break;
                case ')':
                    if (parens == 0) {
                        return true;
                    } else {
                        parens--;
                    }
                    scanner.next();
                    break;
                default:
                    // or control character
                    if (Character.isISOControl(c)) {
                        return !empty;
                    }
                    scanner.next();
                    break;
            }
            empty = false;
        }
        return true;
    }

    private static boolean isEscapable(char c) {
        switch(c) {
            case '!':
            case '"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case '{':
            case '|':
            case '}':
            case '~':
                return true;
        }
        return false;
    }
}
