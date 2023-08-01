package com.swiggy.teststeps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggyFirstOrderSteps extends Driver {
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
	    //accomplised thriugh driver class
	}

	@When("he enters delivery location in navigation bar")
	public void he_enters_delivery_location_in_navigation_bar() {
	    landingPage.searchLocation("Hyderabad");
	}

	@When("he clicks on first available restaurant")
	public void he_clicks_on_first_available_restaurant() {
	    restaurantPage.selectRestaurant();
	}

	@When("he clicks on Add button on first listed dish")
	public void he_clicks_on_add_button_on_first_listed_dish() {
	    orderPage.selectOrder();
	}

	@When("he hover over Cart")
	public void he_hover_over_cart() {
	    orderPage.hoverOvercart();
	}

	@When("he clicks on Check Out in the sub-menu")
	public void he_clicks_on_check_out_in_the_sub_menu() {
	    orderPage.clickOnCheckout();
	}

	@Then("he must be able to order the food successfully")
	public void he_must_be_able_to_order_the_food_successfully() {
	    
	}
}
