package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BusinessEssentialsPage;

public class BusinessEssentialsPageSteps {

	TestContext testContext;
	BusinessEssentialsPage businessEssentialsPage;

	public BusinessEssentialsPageSteps(TestContext context) {
		testContext = context;
		businessEssentialsPage = testContext.getPageObjectManager().getBusinessEssentials();
	}

	@When("^moves to Business Essentials$")
	public void moves_to_Business_Essentials() throws Throwable {
		businessEssentialsPage.businessEssentials();
	}

	@When("^choose to login into Business Essentials$")
	public void choose_to_login_into_Business_Essentials() throws Throwable {
		businessEssentialsPage.entersLoginDetails();
	}

	@Then("^chooses forgot UserID$")
	public void chooses_forgot_UserID() throws Throwable {
		businessEssentialsPage.forgotUserID();
	}

	@Then("^chooses forgot password$")
	public void chooses_forgot_password() throws Throwable {
		businessEssentialsPage.forgotPassword();
	}
	
	@When("^validates Business Essentials login information$")
	public void validates_Business_Essentials_login_information() throws Throwable {
		businessEssentialsPage.errorMsg();
	}
	
	@Then("^choose contact us$")
	public void choose_contact_us() throws Throwable {
		businessEssentialsPage.ContactUs();
	}

}
