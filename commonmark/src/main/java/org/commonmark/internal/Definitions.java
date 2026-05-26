package org.commonmark.internal;

import org.commonmark.node.DefinitionMap;
import java.util.HashMap;
import java.util.Map;

public class Definitions {

    private final Map<Class<?>, DefinitionMap<?>> definitionsByType = new HashMap<>();

    public <D> void addDefinitions(DefinitionMap<D> definitionMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <V> V getDefinition(Class<V> type, String label) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <V> DefinitionMap<V> getMap(Class<V> type) {
        //noinspection unchecked
        return (DefinitionMap<V>) definitionsByType.get(type);
    }
}
