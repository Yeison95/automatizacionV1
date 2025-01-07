package com.enviopack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BackOfficePage extends BasePage {

    private By accessAccountButton = By.xpath("//span[normalize-space()='Acceder a una cuenta']");

    public BackOfficePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public BackOfficePage load() {
        super.load("/backoffice");
        return this;
    }

    public void clickAccessAccountButton() {
        click(accessAccountButton, "Access Account Button");
    }
}
