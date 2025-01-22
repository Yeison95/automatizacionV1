package com.enviopack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BackOfficePage extends BasePage {

    private By accessAccountBtn = By.xpath("//span[normalize-space()='Acceder a una cuenta']");
    private By dataAccountBtn = By.cssSelector("div.layout div.layout__content div.sc-bczRLJ.eQTuku div.sc-bczRLJ.XZEUS div.sc-bczRLJ.hcDqkt:nth-child(2) > div.styled__BackofficeCard-sc-cp812e-3.GNatm:nth-child(2)");
    private By usersManagmentBtn = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1)");
    private By creditRechargeBtn = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(11) > div:nth-child(1)");
    private By shipmentsBtn = By.cssSelector("div.layout div.layout__content div.sc-bczRLJ.eQTuku div.sc-bczRLJ.XZEUS div.sc-bczRLJ.hcDqkt:nth-child(2) > div.styled__BackofficeCard-sc-cp812e-3.GNatm:nth-child(3)");
    private By claimsBtn = By.cssSelector("div[id='app'] div:nth-child(5)");
    
    // Este metodo inicializa el driver en la pagina
    public BackOfficePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    // Este metodo carga la URL de la pagina
    public BackOfficePage load() {
        super.load("/backoffice");
        return this;
    }
    
    // Estos metodos realizan la acción de click sobre los elementos
    public void clickAccessAccountButton() {
        click(accessAccountBtn, "Click Access Account Button");
    }
    
    public void  clickDataAccountbtn(){
    	click(dataAccountBtn,"Click Data Account Button");
    }
    
    public void clickManagmentUsers() {
    	click(usersManagmentBtn,"Click Users managment");
    }
    
    public void clickAccessCreditRechargeButton() {
    	click(creditRechargeBtn, "Click Recharge Credit Button");
    }
    
    public void clickAccessShipmentsButton()  {
        click(shipmentsBtn, "Click Shipments Button");    
    }
    
    public void clickClaimsBtn() {
    	click(claimsBtn, "Click Claims Button");
    }
}
