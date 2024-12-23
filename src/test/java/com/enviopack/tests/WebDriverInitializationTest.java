package com.enviopack.tests;

import com.enviopack.common.BaseTest;
import org.testng.annotations.Test;

public class WebDriverInitializationTest extends BaseTest {

    @Test
    public void testWebDriverInitialization() {
        assert driver != null : "El WebDriver no se ha inicializado correctamente";

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        assert title.contains("Google") : "La página de Google no se cargó correctamente. Título: " + title;
    }
}
