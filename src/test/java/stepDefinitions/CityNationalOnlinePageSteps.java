package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CityNationalOnlinePage;

public class CityNationalOnlinePageSteps {
	
	TestContext testContext;
	CityNationalOnlinePage cityNationalOnlinePage;
	
	public CityNationalOnlinePageSteps(TestContext context) {
		testContext = context;
		cityNationalOnlinePage = testContext.getPageObjectManager().getCityNationalOnlinePage();
	}
	
	@When("^choose to login City National Online$")
	public void choose_to_login_City_National_Online() throws Throwable {
		cityNationalOnlinePage.entersLoginDetails();
		cityNationalOnlinePage.signInButton();
	}
	
	@When("^validates City National Online login information$")
	public void validates_City_National_Online_login_information() throws Throwable {
		cityNationalOnlinePage.errorMsg();
	}
	
	
}
