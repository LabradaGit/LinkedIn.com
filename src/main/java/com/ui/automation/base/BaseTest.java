package com.ui.automation.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
	protected static WebDriver driver; // Made static

	@BeforeMethod
	public void setup() {
		if (driver == null) { // Prevents multiple browser instances
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		driver.get("https://www.linkedin.com/feed/");
	}

	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
			driver = null; // Reset driver for next test
		}
	}
}
