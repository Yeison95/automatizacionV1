package com.enviopack.common;

import com.enviopack.driver.DriverManager;
import com.enviopack.driver.DriverManagerFactory;
import com.enviopack.driver.IDriverManager;
import com.enviopack.config.ConfigBrowser;
import com.enviopack.config.ConfigLoader;
import com.enviopack.config.ConfigAccessor;
import com.enviopack.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ConfigLoader configLoader = new ConfigLoader();
        ConfigAccessor configAccessor = new ConfigAccessor(configLoader.getConfig());
        ConfigBrowser configBrowser = new ConfigBrowser(configAccessor);
        Browser browser = configBrowser.getBrowser();
        
        IDriverManager driverManager = DriverManagerFactory.getManager(browser);
        driver = driverManager.createDriver();
        DriverManager.setDriver(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}


