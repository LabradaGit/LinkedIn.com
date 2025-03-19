package com.ui.automation.stepdefinitions;

import com.ui.automation.base.BaseTest;
import com.ui.automation.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.get("https://yourapplicationurl.com");
    }

    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        loginPage.enterUsername("testUser");
        loginPage.enterPassword("testPassword");
    }

    @And("Clicks login button")
    public void clicksLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User should be redirected to homepage")
    public void userShouldBeRedirectedToHomepage() {
        // Add assertions for verification
    }
}
