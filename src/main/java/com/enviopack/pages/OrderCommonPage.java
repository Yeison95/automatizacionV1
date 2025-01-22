package com.enviopack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class OrderCommonPage extends BasePage {

    private By ordersSidenavItem = By.xpath("//div[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiListItem-root') and contains(@class, 'sidenav__first') and .//span[contains(text(),'Órdenes')]]");
    private By createOrdenBtn = By.cssSelector(".button-select__wrapper--contained-primary");
    private By createOrderDropdownBtn = By.cssSelector("button[class='button-select__with-caret']");
    private By searchBarBtn = By.name("q");
    private By moreActionsBtn = By.xpath("//span[@class='button-select__name' and text()='Más acciones']");
    private By filterBtn = By.xpath("//span[text()='Filtros']");
    // Localizador de las cabeceras de las columnas
    private By headers = By.cssSelector(".table__head .table__cell");

    public OrderCommonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Métodos comunes para botones y navegación
    public void clickOrdersSidenavItem() {
        click(ordersSidenavItem, "Order Sidenav Item");
    }

    public void clickCreateOrden() {
        click(createOrdenBtn, "Create Orden Button");
    }

    public void clickCreateOrderDropdown() {
        click(createOrderDropdownBtn, "Create Order Dropdown Button");
    }

    public void clickSearchBar() {
        click(searchBarBtn, "Search Bar");
    }

    public void clickMoreActions() {
        click(moreActionsBtn, "More Actions Button");
    }

    public void clickFilter() {
        click(filterBtn, "Filter Button");
    }

    // Método genérico para obtener los nombres de las columnas
    public List<String> obtenerNombresColumnas() {
        List<WebElement> columnasElementos = getElements(headers, "Column Headers");
        List<String> nombresColumnas = new ArrayList<>();
        for (WebElement columna : columnasElementos) {
            nombresColumnas.add(columna.getText().trim());
        }
        return nombresColumnas;
    }

    // Método para contar la cantidad total de columnas
    public int contarColumnas() {
        return getElements(headers, "Column Headers").size();
    }
}
