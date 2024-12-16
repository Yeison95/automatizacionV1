package com.enviopack.config;

import com.enviopack.enums.Browser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ConfigReader {

    private static JsonNode config;

    static {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            config = objectMapper.readTree(new File("src/main/resources/config/properties.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la URL desde el archivo JSON
    public static String getUrl() {
        return config.path("url").asText();  
    }

    // Método para obtener el navegador desde el archivo JSON y convertirlo al tipo Browser
    public static Browser getBrowser() {
        String browser = config.path("browser").asText().toUpperCase(); 
        return Browser.valueOf(browser);  
    }
}
