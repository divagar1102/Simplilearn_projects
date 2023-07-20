package com.simplilearn.Simplilearn;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class BaseTest {
	    WebDriver driver;
	     @BeforeTest
	     public void launchApplication() {
	    	 driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.get("https://www.simplilearn.com/");
	     }

	    @Test
	    public void verifyText() {
	        driver.get("https://www.simplilearn.com/");
	        WebElement allCourses = driver.findElement(By.linkText("All Courses"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(allCourses).build().perform();
	        WebElement softwareDevelopment = driver.findElement(By.linkText("Software Development"));
	        actions.moveToElement(softwareDevelopment).build().perform();
	        WebElement automationTesting = driver.findElement(By.linkText("Automation Testing Masters Program"));
	        automationTesting.click();
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement verificationText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Automation Test Engineer')]")));

	        Assert.assertTrue(verificationText.isDisplayed(), "'Automation Test Engineer' text is not visible.");

	    }
	    @AfterTest
	     public void closeBrowser() {
	    	 driver.quit();
	     }
	}


