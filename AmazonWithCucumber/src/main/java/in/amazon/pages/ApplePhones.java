package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplePhones {
	private WebDriverWait wait;
@FindBy(xpath = "(//div[contains(@class,'s-card-container')])[2]")
private WebElement secondMobile;
public ApplePhones(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickSecondMobile() {
	secondMobile.click();
}
}
