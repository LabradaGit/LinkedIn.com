package com.ui.automation.stepdefinitions;

import com.ui.automation.pages.LoginPage;
import com.ui.automation.utils.DriverManager;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver = DriverManager.getDriver(); // Ensure WebDriver is initialized
        loginPage = new LoginPage(driver);  // Pass the initialized driver
        driver.get("https://www.linkedin.com/feed/");  // Navigate to login page
    }

    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        loginPage.enterUsername("labradaluism@gmail.com");
        loginPage.enterPassword("Romar9216");
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
