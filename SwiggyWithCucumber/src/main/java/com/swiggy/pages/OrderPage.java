package com.swiggy.pages;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
	private Actions actions;
	private WebDriverWait wait;
	@FindBy(xpath = "(//div[contains(@class,'_1RPOp')])[1]")
	private WebElement firstOrder;
	
	@FindBy(xpath = "(//a[contains(@class,'_1T-E4')])[1]")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//div[contains(@class,'_2haVU')]")
	private WebElement cartFloat;
	
	@FindBy(xpath = "//div[contains(@class,'_55uP6')]")
	private WebElement checkoutBtn;
	
	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}
	public void selectOrder() {
		wait.until(ExpectedConditions.visibilityOf(firstOrder));
		firstOrder.click();
	}
	public void hoverOvercart() {
		actions.moveToElement(cartBtn).build().perform();
		wait.until(ExpectedConditions.visibilityOf(cartFloat));	
	}
	public void clickOnCheckout() {
		wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
		checkoutBtn.click();
		
	}
	
}
