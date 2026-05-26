package org.commonmark.node;

import org.commonmark.internal.util.Escaping;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * A map that can be used to store and look up reference definitions by a label. The labels are case-insensitive and
 * normalized, the same way as for {@link LinkReferenceDefinition} nodes.
 *
 * @param <D> the type of value
 */
public class DefinitionMap<D> {

    private final Class<D> type;

    // LinkedHashMap for determinism and to preserve document order
    private final Map<String, D> definitions = new LinkedHashMap<>();

    public DefinitionMap(Class<D> type) {
        this.type = type;
    }

    public Class<D> getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addAll(DefinitionMap<D> that) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Store a new definition unless one is already in the map. If there is no definition for that label yet, return null.
     * Otherwise, return the existing definition.
     * <p>
     * The label is normalized by the definition map before storing.
     */
    public D putIfAbsent(String label, D definition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Look up a definition by label. The label is normalized by the definition map before lookup.
     *
     * @return the value or null
     */
    public D get(String label) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<String> keySet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<D> values() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
