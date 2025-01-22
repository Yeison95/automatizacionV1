package com.enviopack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccesAccountPageDELETE extends BasePage {
    private By sellerInput = By.name("empresa");
    private By firstSellerItem = By.id("react-autowhatever-1--item-0");
    
    public AccesAccountPageDELETE(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    public AccesAccountPageDELETE enterSellerId(String sellerId) {
        sendKeys(sellerInput, sellerId, "Seller Input");
        return this;
    }
    
    public AccesAccountPageDELETE selectFirstSeller() {
    	click(firstSellerItem, "Click sobre el primer elemento");
        return this;  // Devuelve la instancia actual para permitir el encadenamiento
    }
}
