package com.ui.automation.tests;

import com.ui.automation.base.BaseTest;
import com.ui.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testUser");
        loginPage.enterPassword("testPassword");
        loginPage.clickLogin();
    }
}
