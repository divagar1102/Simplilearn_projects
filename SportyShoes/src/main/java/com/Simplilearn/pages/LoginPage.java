package com.Simplilearn.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
     WebDriverWait wait;
	@FindBy(id ="email")
	private WebElement email;
	
	@FindBy(id ="password")
	private WebElement password;
	
	@FindBy(xpath ="//a[contains(text(),'Register')]")
	private WebElement register;
	
	@FindBy(xpath ="//button[contains(text(),'Login')]")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	   wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	public void registerUser() {
		register.click();
	}
}
