package com.simplilearn.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EcommerceAutomate {
	    private WebDriver driver;
	    private String baseUrl = "https://www.saucedemo.com/";

	    @BeforeClass
	    public void setUp() {
	        // Set up the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testOrderFirstProduct() {
	        // Step 1: Navigate to the saucedemo.com website
	        driver.get(baseUrl);

	        // Step 2: Log in with valid credentials (assuming you have registered an account)
	        WebElement usernameField = driver.findElement(By.id("user-name"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("login-button"));

	        usernameField.sendKeys("standard_user");
	        passwordField.sendKeys("secret_sauce");
	        loginButton.click();
            WebElement clickOnOrder = driver.findElement(By.className("inventory_item_name"));
            clickOnOrder.click();
	        // Step 3: Order the first product in the list
	        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	        addToCartButton.click();

	        // Step 4: Go to the cart
	        WebElement shoppingCartLink = driver.findElement(By.className("shopping_cart_link"));
	        shoppingCartLink.click();

	        // Step 5: Click on the Checkout button
	        WebElement checkoutButton = driver.findElement(By.id("checkout"));
	        checkoutButton.click();

	        // Step 6: Enter your details
	        WebElement firstNameField = driver.findElement(By.id("first-name"));
	        WebElement lastNameField = driver.findElement(By.id("last-name"));
	        WebElement zipCodeField = driver.findElement(By.id("postal-code"));

	        firstNameField.sendKeys("Divagar");
	        lastNameField.sendKeys("Manivasagan");
	        zipCodeField.sendKeys("12345");
	        WebElement ContinueButton = driver.findElement(By.id("continue"));
	        ContinueButton.click();

	        // Step 7: Click on the Finish button
	        WebElement finishButton = driver.findElement(By.id("finish"));
	        finishButton.click();

	        // Step 8: Verify the order confirmation message
	        WebElement orderConfirmationMessage = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order')]"));
	        assert orderConfirmationMessage.isDisplayed();

	    }

	    @AfterClass
	    public void closeBrowser() {
	            driver.quit();
	        }
	    }
	


