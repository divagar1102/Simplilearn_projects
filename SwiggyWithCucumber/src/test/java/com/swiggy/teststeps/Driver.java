package com.swiggy.teststeps;
import org.openqa.selenium.chrome.ChromeDriver;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.OrderPage;
import com.swiggy.pages.RestaurantPage;


public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static RestaurantPage restaurantPage;
	protected static OrderPage orderPage;
public static void init() {

	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.swiggy.com");
    landingPage = new LandingPage(driver);
    restaurantPage = new RestaurantPage(driver);
    orderPage = new OrderPage(driver);
}
}