package com.enviopack.driver;
import org.openqa.selenium.WebDriver;
import com.enviopack.enums.Browser;

public interface IDriverManagerFactory {
    WebDriver createDriver(Browser browser);
}