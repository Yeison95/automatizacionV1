package com.enviopack.driver;
import org.openqa.selenium.WebDriver;
import com.enviopack.enums.Browser;

public interface IWebDriverFactory {
    WebDriver createDriver(Browser browser);
}