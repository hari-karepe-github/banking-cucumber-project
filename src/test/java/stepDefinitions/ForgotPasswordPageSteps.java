package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageObjects.ForgotPasswordPage;

public class ForgotPasswordPageSteps {

	TestContext testContext;
	ForgotPasswordPage forgotPasswordPage;

	public ForgotPasswordPageSteps(TestContext context) {
		testContext = context;
		forgotPasswordPage = testContext.getPageObjectManager().getForgotPasswordPage();
	}

	@Then("^enter forgot password details$")
	public void enter_forgot_password_details() throws Throwable {
		forgotPasswordPage.forgotPassword();
		forgotPasswordPage.enterUserDetails();
		forgotPasswordPage.forgotPasswordSubmit_btn();
		forgotPasswordPage.erroMsg();
		forgotPasswordPage.cancel();
	}

}
