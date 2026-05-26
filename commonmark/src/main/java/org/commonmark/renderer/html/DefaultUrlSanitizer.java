package org.commonmark.renderer.html;

import java.util.*;

/**
 * Allows http, https, mailto, and data protocols for url.
 * Also allows protocol relative urls, and relative urls.
 * Implementation based on https://github.com/OWASP/java-html-sanitizer/blob/f07e44b034a45d94d6fd010279073c38b6933072/src/main/java/org/owasp/html/FilterUrlByProtocolAttributePolicy.java
 */
public class DefaultUrlSanitizer implements UrlSanitizer {

    private Set<String> protocols;

    public DefaultUrlSanitizer() {
        this(List.of("http", "https", "mailto", "data"));
    }

    public DefaultUrlSanitizer(Collection<String> protocols) {
        this.protocols = new HashSet<>(protocols);
    }

    @Override
    public String sanitizeLinkUrl(String url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String sanitizeImageUrl(String url) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String stripHtmlSpaces(String s) {
        int i = 0, n = s.length();
        for (; n > i; --n) {
            if (!isHtmlSpace(s.charAt(n - 1))) {
                break;
            }
        }
        for (; i < n; ++i) {
            if (!isHtmlSpace(s.charAt(i))) {
                break;
            }
        }
        if (i == 0 && n == s.length()) {
            return s;
        }
        return s.substring(i, n);
    }

    private boolean isHtmlSpace(int ch) {
        switch(ch) {
            case ' ':
            case '\t':
            case '\n':
            case '\u000c':
            case '\r':
                return true;
            default:
                return false;
        }
    }
}
