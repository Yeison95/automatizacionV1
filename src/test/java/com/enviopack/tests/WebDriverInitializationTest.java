package com.enviopack.tests;

import com.enviopack.common.BaseTest;
import org.testng.annotations.Test;

public class WebDriverInitializationTest extends BaseTest {

    @Test
    public void testWebDriverInitialization() {
        // Verificar que el WebDriver no sea nulo
        assert driver != null : "El WebDriver no se ha inicializado correctamente";

        // Navegar a una URL de prueba
        driver.get("https://www.google.com");

        // Verificar que la página se haya cargado correctamente (por ejemplo, verificar el título de la página)
        String title = driver.getTitle();
        assert title.contains("Google") : "La página de Google no se cargó correctamente. Título: " + title;

        // Aquí puedes agregar más validaciones si es necesario
    }
}
