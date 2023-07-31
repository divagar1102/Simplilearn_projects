package in.amazon.teststeps;
import org.openqa.selenium.chrome.ChromeDriver;
import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class Driver extends Tools {
	protected static AllMobileBrands allMobileBrands;
	protected static LandingPage landingPage;
	protected static ApplePhones applePhones;
	protected static BuyPhone buyPhones;
	protected static SignIn signIn;
	public static void init() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://amazon.in");
	    landingPage = new LandingPage(driver);
	    allMobileBrands = new AllMobileBrands(driver);
	    applePhones = new ApplePhones(driver);
	     buyPhones = new BuyPhone(driver);
	     signIn = new SignIn(driver);
	}

}
