package com.enviopack.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.enviopack.common.BaseTest;
import com.enviopack.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginLocators() {
    	LoginPage loginPage = new LoginPage(driver); 
    	loginPage.load();

        try {
            loginPage.enterEmail("test@example.com");
            Assert.assertTrue(true, "Email input located successfully.");
        } catch (Exception e) {
            Assert.fail("Email input not located.");
        }
        
        try {
            loginPage.enterPassword("password");
            Assert.assertTrue(true, "Password input located successfully.");
        } catch (Exception e) {
            Assert.fail("Password input not located.");
        }
        
        try {
            loginPage.clickLogin();
            Assert.assertTrue(true, "Login button located successfully.");
        } catch (Exception e) {
            Assert.fail("Login button not located.");
        }
    }
}

