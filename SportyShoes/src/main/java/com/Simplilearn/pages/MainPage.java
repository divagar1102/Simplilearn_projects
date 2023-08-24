package com.Simplilearn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
WebDriverWait wait;
Actions action;

@FindBy(xpath = "(//a[contains(text(),'Cart')][1]")
private WebElement cart;

@FindBy(xpath = "//a[contains(text(),'Orders')]")
private WebElement orders;

@FindBy(xpath = "//a[contains(text(),'Profile')]")
private WebElement profile;

@FindBy(xpath = "(//strong[contains(text(),'Success')])")
private WebElement endMessage;


public void clickCart() {
	cart.click();
}
public void clickOrders() {
	orders.click();
}
public void clickProfile() {
	profile.click();
}
public String verifyMsg() {
	String msg = endMessage.getText();
	return msg;
}
}