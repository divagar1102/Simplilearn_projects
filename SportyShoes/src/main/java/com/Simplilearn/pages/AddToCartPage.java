package com.Simplilearn.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
    
	@FindBy(xpath ="(//a[contains(@class,'btn btn-primary')])[2]")
	private WebElement shoe1;
	
	@FindBy(xpath ="(//a[contains(@class,'btn btn-primary')])[3]")
	private WebElement shoe2;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutBtn;
	
	JavascriptExecutor js;
	Actions actions;
    WebDriverWait wait;
	
public AddToCartPage(WebDriver driver) {
	js = (JavascriptExecutor) driver;
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
}
public void Shoe1() throws InterruptedException {
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView();", shoe1);
	js.executeScript("arguments[0].click()", shoe1);
}
public void Shoe2() {
	///shoe2.click();
	actions.moveToElement(shoe2).click().perform();
	}
public void clickOnLogoutBtn() {
	logoutBtn.click();
}
}