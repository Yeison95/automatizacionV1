package com.enviopack.tests;

import com.enviopack.common.BaseTest;

import java.util.List;

import org.testng.annotations.Test;
import com.enviopack.pages.BackOfficePage;
import com.enviopack.pages.AccesAccountPageDELETE;
import com.enviopack.pages.OrderCommonPage;
import com.enviopack.pages.OrdersInProgressPage;

public class OrdersTestDELETE extends BaseTest {

    @Test
    public void testClickAccessAccountButton() {
        BackOfficePage backOfficePage = new BackOfficePage(driver);
        loginAs("admin");
        backOfficePage.clickAccessAccountButton();

        AccesAccountPageDELETE accesAccountPage = new AccesAccountPageDELETE(driver); 
        accesAccountPage.enterSellerId("5710")
        				.selectFirstSeller();
        OrderCommonPage orderCommonPage = new OrderCommonPage(driver);
        List<String> columnNames = orderCommonPage.obtenerNombresColumnas();
        columnNames.forEach(System.out::println);  // Imprime los nombres de las columnas para verificar
        
    }
}
