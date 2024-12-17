package com.enviopack.tests;

import com.enviopack.config.ConfigLoader;
import com.enviopack.config.ConfigAccessor;
import com.enviopack.config.ConfigBrowser;
import com.enviopack.enums.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestConfigExample  {

    @Test
    public void testConfigLoader() {
        // Path al archivo de configuración (ajustar según corresponda)
        String filePath = "src/main/resources/config/properties.json";
        
        // Crear una instancia de ConfigLoader
        ConfigLoader configLoader = new ConfigLoader(filePath);
        
        // Verificar que el archivo se cargó correctamente
        Assert.assertNotNull(configLoader.getConfig(), "La configuración no se cargó correctamente.");
    }

    @Test
    public void testConfigAccessor() {
        // Path al archivo de configuración (ajustar según corresponda)
        String filePath = "src/main/resources/config/properties.json";
        
        // Crear ConfigLoader y ConfigAccessor
        ConfigLoader configLoader = new ConfigLoader(filePath);
        ConfigAccessor configAccessor = new ConfigAccessor(configLoader.getConfig());
        
        // Verificar la obtención de un valor String
        String url = configAccessor.getValor("url");
        Assert.assertNotNull(url, "La URL no fue encontrada en la configuración.");
        
        // Verificar la obtención de un valor int
        int port = configAccessor.getInt("port");
        Assert.assertTrue(port > 0, "El puerto no es válido.");
        
        // Verificar la obtención de un valor booleano
        boolean isEnabled = configAccessor.getBoolean("isEnabled");
        Assert.assertTrue(isEnabled, "La clave isEnabled no tiene el valor correcto.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConfigAccessorException() {
        // Path al archivo de configuración (ajustar según corresponda)
        String filePath = "src/main/resources/config/properties.json";
        
        // Crear ConfigLoader y ConfigAccessor
        ConfigLoader configLoader = new ConfigLoader(filePath);
        ConfigAccessor configAccessor = new ConfigAccessor(configLoader.getConfig());
        
        // Intentar acceder a una clave que no existe
        configAccessor.getValor("nonexistentKey");
    }

    @Test
    public void testBrowserConfig() {
        // Path al archivo de configuración (ajustar según corresponda)
        String filePath = "src/main/resources/config/properties.json";
        
        // Crear ConfigLoader y ConfigAccessor
        ConfigLoader configLoader = new ConfigLoader(filePath);
        ConfigAccessor configAccessor = new ConfigAccessor(configLoader.getConfig());
        
        // Crear BrowserConfig
        ConfigBrowser configBrowser = new ConfigBrowser(configAccessor);
        
        // Verificar que el valor "browser" se mapee correctamente al enum Browser
        Browser browser = configBrowser.getBrowser();
        Assert.assertNotNull(browser, "El navegador no fue configurado correctamente.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testBrowserConfigInvalid() {
        // Simular un archivo de configuración con un valor no válido para "browser"
        String invalidFilePath = "src/main/resources/config/invalidBrowserConfig.json";
        
        // Crear ConfigLoader y ConfigAccessor
        ConfigLoader configLoader = new ConfigLoader(invalidFilePath);
        ConfigAccessor configAccessor = new ConfigAccessor(configLoader.getConfig());
        
        // Crear BrowserConfig
        ConfigBrowser configBrowser = new ConfigBrowser(configAccessor);
        
        // Intentar obtener el valor de un navegador no válido
        configBrowser.getBrowser();
    }
}

