package org.commonmark.ext.heading.anchor.internal;

import org.commonmark.ext.heading.anchor.IdGenerator;
import org.commonmark.renderer.html.AttributeProvider;
import org.commonmark.node.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HeadingIdAttributeProvider implements AttributeProvider {

    private final IdGenerator idGenerator;

    private HeadingIdAttributeProvider(String defaultId, String prefix, String suffix) {
        idGenerator = IdGenerator.builder().defaultId(defaultId).prefix(prefix).suffix(suffix).build();
    }

    public static HeadingIdAttributeProvider create(String defaultId, String prefix, String suffix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setAttributes(Node node, String tagName, final Map<String, String> attributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
