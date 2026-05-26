package org.commonmark.internal.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Html5Entities {

    private static final Map<String, String> NAMED_CHARACTER_REFERENCES = readEntities();

    private static final String ENTITY_PATH = "/org/commonmark/internal/util/entities.txt";

    public static String entityToString(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Map<String, String> readEntities() {
        Map<String, String> entities = new HashMap<>();
        InputStream stream = Html5Entities.class.getResourceAsStream(ENTITY_PATH);
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream, charset))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                int equal = line.indexOf("=");
                String key = line.substring(0, equal);
                String value = line.substring(equal + 1);
                entities.put(key, value);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
        entities.put("NewLine", "\n");
        return entities;
    }
}
