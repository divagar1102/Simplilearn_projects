package com.Simplilearn.testscripts;

import org.testng.annotations.Test;
import com.Simplilearn.pages.AddToCartPage;
import com.Simplilearn.pages.LoginPage;
import com.Simplilearn.pages.MainPage;
import com.Simplilearn.pages.RegisterPage;

public class OrderTest extends BaseTest {
	@Test
public void SignUp() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		RegisterPage registerPage = new RegisterPage(driver);
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		MainPage mainPage = new MainPage();
	loginPage.registerUser();
	registerPage.enterUsername("Harry");
	registerPage.enterEmail("harry123@gmail.com");
	registerPage.enterPassword("harrybrook1");
	registerPage.clickRegister();
	addToCartPage.Shoe1();
	addToCartPage.Shoe2();
	mainPage.clickCart();
	mainPage.clickOrders();
	mainPage.clickProfile();
}
}
