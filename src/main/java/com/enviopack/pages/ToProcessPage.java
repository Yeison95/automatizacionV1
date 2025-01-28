package com.enviopack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ToProcessPage extends BasePage {
	
	private By toProcessTitle = By.cssSelector(".sc-evZas.hrDTLF");
	private By toProcessMoreActionsBtn = By.cssSelector("div[class='button-select__wrapper button-select__wrapper--ghost button-select__wrapper--ghost-primary button-select__wrapper--height-low'] span[class='button-select__name']");
	private By toProcessQuoteAndCreateBtn = By.cssSelector("div[class='button-select__wrapper button-select__wrapper--contained button-select__wrapper--contained-primary button-select__wrapper--height-low'] span[class='button-select__name']");
	private By toProcessQuoteAndCreateArrowBtn = By.cssSelector(".button-select__button-caret");
	private By toProcessReturnBtn = By.cssSelector("div[class='button-select__options-wrapper'] div:nth-child(1) span:nth-child(1)");
	private By toProcessUploadCsvBtn = By.cssSelector("div[class='layout__main-header'] div[class='sc-bczRLJ lkpwjH'] div:nth-child(2) span:nth-child(1)");
	private By toProcessTableSearch = By.cssSelector("div[name='q']");
	private By toProcessTableSearchModalTitle = By.cssSelector(".sc-evZas.iOWtmw");
	private By toProcessTableSearchBySelector = By.cssSelector(".input__content.input__content--hover.input__content--select");
	private By toProcessTableSearchByOrder = By.cssSelector(".input__select-option.input__select-option--selected");
	private By toProcessTableSearchByCustomer = By.cssSelector("div[class='input__select-option']");
	private By toProcessTableSearchInput = By.cssSelector("input[placeholder='Buscar por número de orden']");
	private By toProcessTableSearchFindBtn = By.cssSelector(".sc-bczRLJ.cvcONn");
			
    public ToProcessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    public ToProcessPage load() {
        super.load("/por-procesar?orden_columna=fecha_alta&orden_sentido=DESC&pagina=1&ppp=50");
        return this;
    }
    
    public void clickToProcessMoreActionsBtn() {
    	click(toProcessMoreActionsBtn, "Click More Actions Button");
    }
    
    public void clickToProcessQuoteAndCreateBtn() {
    	click(toProcessQuoteAndCreateBtn, "Click Quote And Create Button");
    }
    
    public void clickToProcessQuoteAndCreateArrowBtn() {
    	click(toProcessQuoteAndCreateArrowBtn, "Click Quote And Create Arrow Button");
    }
    
    public void clickToProcessReturnBtn() {
    	click(toProcessReturnBtn, "Click Return Button");
    }
    
    public void clicktoProcessUploadCsvBtn() {
    	click(toProcessUploadCsvBtn, "Click Upload CSV Button");
    }
    
    public void clickToProcessTableSearch() {
    	click(toProcessTableSearch, "Click Table Search");
    }
    
    public void clickToProcessTableSearchBySelector() {
    	click(toProcessTableSearchBySelector, "Click Table Search By Selector");
    }
    
    public void clickToProcessTableSearchByOrder() {
    	click(toProcessTableSearchByOrder, "Click Table Search By Order");
    }
    
    public void clickToProcessTableSearchByCustomer() {
    	click(toProcessTableSearchByCustomer, "Click Table Search By Customer");
    }
    
    public void sendKeystoProcessTableSearchInput(String customerOrOrder) {
    	sendKeys(toProcessTableSearchInput,customerOrOrder,"Send Order/Customer");
    }
    
    public void clickToProcessTableSearchFindBtn() {
    	click(toProcessTableSearchFindBtn, "Click Find Button");
    }

}
