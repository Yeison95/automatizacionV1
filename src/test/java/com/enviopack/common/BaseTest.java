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
        configLoader = new ConfigLoader();
        configBrowser = new ConfigBrowser(new ConfigAccessor(configLoader.getConfig()));
        Browser browser = configBrowser.getBrowser();
        CustomWebDriverManager driverManager = new CustomWebDriverManager();
        driver = driverManager.createDriver(browser);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

