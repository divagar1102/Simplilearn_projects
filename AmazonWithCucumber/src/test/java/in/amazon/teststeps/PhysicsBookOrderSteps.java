package in.amazon.teststeps;
import org.testng.Assert;
import in.amazon.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhysicsBookOrderSteps extends Driver{
	@Given("he open the browser and maximize it")
	public void he_open_the_browser_and_maximize_it() {
	}
      //Driver class handles this condition
	@When("he navigate to the application")
	public void he_navigate_to_the_application() {
	  //Driver class handles this condition
	}

	@When("he type {string} in the search box")
	public void he_type_in_the_search_box(String string) throws InterruptedException {
	    landingPage.searchItem("physics books for jee mains and advanced");
	}

	@When("he select the 3rd option from the drop-down")
	public void he_select_the_3rd_option_from_the_drop_down() {
	   //drop down option comprises under above condition
	}

	@When("he select rating {int} star and above from the left sidebar")
	public void he_select_rating_star_and_above_from_the_left_sidebar(Integer int1) {
	    landingPage.clickOnRating();
	}

	@When("he click on the first search result")
	public void he_click_on_the_first_search_result() {
	    landingPage.clickfirstBook();
	}

	@When("he click {string} button")
	public void he_click_button(String string) {
	    landingPage.clickOnBuyBook();
	}

	@Then("he click on {string} button")
	public void he_click_on_button(String string) {
		LandingPage landingPage = new LandingPage(driver); 
		landingPage.searchBox();
	}

	@Then("he verify I am on the Sign in page")
	public void he_verify_i_am_on_the_sign_in_page() {
		 String expectedText = "Sign in";
		    String actualText = signIn.getSignInText();
		    Assert.assertEquals(actualText, expectedText);
	}

	@Then("he close the browser")
	public void he_close_the_browser() {
	    
	}
}
