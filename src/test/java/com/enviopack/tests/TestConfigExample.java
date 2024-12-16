package com.enviopack.tests;

import com.enviopack.config.ConfigReader;
import com.enviopack.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestConfigExample {
    
    @Test
    public void testBrowserInitialization() {
        // Obtener la URL y el navegador desde el archivo de configuración
        String url = ConfigReader.getUrl();
        Browser browser = ConfigReader.getBrowser();

        // Imprimir los valores leídos
        System.out.println("URL: " + url);
        System.out.println("Browser: " + browser);

        // Aquí puedes usar el enum Browser para iniciar el WebDriver
        WebDriver driver = null;

        switch (browser) {
            case CHROME:
                // Iniciar WebDriver para Chrome
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                // Iniciar WebDriver para Firefox
                driver = new FirefoxDriver();
                break;
            case EDGE:
                // Iniciar WebDriver para Edge (necesitarías agregar la implementación de EdgeDriver)
                // driver = new EdgeDriver();
                break;
            default:
                throw new IllegalStateException("Unsupported browser: " + browser);
        }

        // Navegar a la URL
        driver.get(url);
        
        // Aquí puedes agregar más pasos de prueba, por ejemplo:
        // Assert.assertEquals(driver.getTitle(), "Expected Title");

        // Cerrar el navegador al finalizar la prueba
        driver.quit();
    }
}

