package in.amazon.pages;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions;
	private WebDriverWait wait;
@FindBy(linkText = "Mobiles")
private WebElement mobiles;
@FindBy(id = "nav-link-accountList")
private WebElement signInMenu;
@FindBy(linkText = "Sign in")
private WebElement signInBtn;

@FindBy(id = "twotabsearchtextbox")
private WebElement searchBox;

@FindBy(xpath ="//div[contains(@class,'autocomplete-results-container')]")
private WebElement autoCompleteBox;

@FindBy(xpath ="(//h2[contains(@class, 'a-size-mini')])[1]")
private WebElement firstBook;

@FindBy(id ="buy-now-button")
private WebElement buyBook;

@FindBy(xpath ="//i[contains(@class, 'a-star-medium-4')]")
private WebElement ratingPage;

public LandingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}
public void clickMobiles() {
	mobiles.click();
}
public void hoverOverHelloSignInMenu() {
	actions.moveToElement(signInMenu).build().perform();
}
public void clickSignInBtn() {
	signInBtn.click();
}
public void searchItem(String item) throws InterruptedException{
	searchBox.sendKeys(item);
	wait.until(ExpectedConditions.visibilityOfAllElements(autoCompleteBox));
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
}
public void searchBox() {
	searchBox.click();// TODO Auto-generated method stub
	
}
public void clickfirstBook() {
	firstBook.click();
}
public void clickOnBuyBook() {
	buyBook.click();
}
public void clickOnRating() {
	ratingPage.click();
}
}
