package in.amazon.teststeps;

import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;

public class AutoCompleteBoxText extends Driver {
	@Test
	public void selectItem() throws InterruptedException{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.searchItem("physics books");
	}

}
