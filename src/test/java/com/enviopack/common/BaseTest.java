package com.enviopack.common;

import com.enviopack.driver.DriverManager;
import com.enviopack.factory.DriverManagerFactory;
import com.enviopack.driver.IDriverManager;
import com.enviopack.config.ConfigLoader;
import com.enviopack.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;
    private String url;

    @BeforeMethod
    public void setUp() {
        ConfigLoader configLoader = ConfigLoader.getInstance();
        url = configLoader.getBaseUrl();
        Browser browser = Browser.valueOf(configLoader.getBrowser().toUpperCase());
        IDriverManager driverManager = DriverManagerFactory.getManager(browser);
        driver = driverManager.createDriver();
        DriverManager.setDriver(driver);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}

