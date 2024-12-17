package com.enviopack.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConfigLoader {

    private static final String DEFAULT_CONFIG_PATH = "src/main/resources/config/properties.json"; // Ruta predeterminada
    private final JsonNode config;

    public ConfigLoader() {
        this(DEFAULT_CONFIG_PATH); // Llamar al constructor con la ruta predeterminada
    }

    public ConfigLoader(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            this.config = objectMapper.readTree(new File(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar el archivo de configuracion: " + e.getMessage(), e);
        }
    }

    public JsonNode getConfig() {
        return this.config;
    }
}
