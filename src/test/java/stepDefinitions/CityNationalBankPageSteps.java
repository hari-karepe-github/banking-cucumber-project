package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.CityNationalBankPage;

public class CityNationalBankPageSteps {

	TestContext testContext;
	CityNationalBankPage cityNationalBankPage;

	public CityNationalBankPageSteps(TestContext context) {
		testContext = context;
		cityNationalBankPage = testContext.getPageObjectManager().getCityNationalBank();
	}

	@Given("^he taps on signIn page$")
	public void he_taps_on_signIn_page() throws Throwable {
		cityNationalBankPage.signIn_Image();
		cityNationalBankPage.signInButton();
	}

}
