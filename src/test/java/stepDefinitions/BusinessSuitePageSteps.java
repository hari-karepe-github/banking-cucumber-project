package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.BusinessSuitePage;

public class BusinessSuitePageSteps {
	
	TestContext testContext;
	BusinessSuitePage businessSuitePage;
	
	public BusinessSuitePageSteps(TestContext context) {
		testContext = context;
		businessSuitePage = testContext.getPageObjectManager().getBusinessSuite();
	}
	
	@When("^moves to Business Suite$")
	public void moves_to_Business_Suite() throws Throwable {
		businessSuitePage.businessSuite();
	}
	
	@When("^choose to login into Business Suite$")
	public void choose_to_login_into_Business_Suite() throws Throwable {
		businessSuitePage.entersLoginDetails();
		businessSuitePage.signInButton();
	}
	
	@When("^validates Business Suite login information$")
	public void validates_Business_Suite_login_information() throws Throwable {
		businessSuitePage.errorMsg();
	}

}
