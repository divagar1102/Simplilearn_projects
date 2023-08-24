package com.Simplilearn.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
    @BeforeTest
    public void launchApplication() {
     ChromeOptions options = new ChromeOptions();
   	 driver = new ChromeDriver(options);
   	 driver.manage().window().maximize();
   	 driver.get("http://localhost:9010/");
    }
    @AfterTest
    public void closeBrowser() {
   	 driver.quit();
    }
}

