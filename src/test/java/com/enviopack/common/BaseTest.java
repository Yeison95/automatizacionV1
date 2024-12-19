package com.enviopack.common;

import com.enviopack.config.ConfigLoader;
import com.enviopack.config.ConfigAccessor;
import com.enviopack.config.ConfigBrowser;
import com.enviopack.driver.CustomWebDriverManager;
import com.enviopack.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    private ConfigLoader configLoader;
    private ConfigBrowser configBrowser;

    @BeforeMethod
    public void setUp() {
        // Cargar configuración
        configLoader = new ConfigLoader();
        configBrowser = new ConfigBrowser(new ConfigAccessor(configLoader.getConfig()));

        // Obtener el navegador configurado
        Browser browser = configBrowser.getBrowser();

        // Crear el WebDriver según el navegador configurado
        CustomWebDriverManager driverManager = new CustomWebDriverManager();
        driver = driverManager.createDriver(browser);

        // Configuración adicional si es necesario (por ejemplo, maximizar la ventana del navegador)
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        // Cerrar el navegador después de cada prueba
        if (driver != null) {
            driver.quit();
        }
    }
}

