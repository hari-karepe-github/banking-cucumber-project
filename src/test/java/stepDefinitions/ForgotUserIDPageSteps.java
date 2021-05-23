package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.ForgotUserIDPage;

public class ForgotUserIDPageSteps {
	
	TestContext testContext;
	ForgotUserIDPage forgotUserIDPage;
	
	public ForgotUserIDPageSteps(TestContext context) {
		testContext = context;
		forgotUserIDPage = testContext.getPageObjectManager().getForgotUserIDPage();
	}
	
	@Then("^enter forgot UserID details$")
	public void enter_forgot_UserID_details() throws Throwable {
		
		forgotUserIDPage.forgetUserIDText();
		forgotUserIDPage.enterUserDetails();
		forgotUserIDPage.forgotUserId_Submit();
		forgotUserIDPage.forgotUserId_errorMsg();
		forgotUserIDPage.cancel_btn();
	   
	}

}
