package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		homePage.navigateTo_HomePage();
	}

	@Then("^browser close$")
	public void browser_close() throws Throwable {
		testContext.getWebDriverManager().closeDriver();
		testContext.getWebDriverManager().quitDriver();
	}
}
