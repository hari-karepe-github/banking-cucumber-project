package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import managers.FileReaderManager;
import pageObjects.ContactUsPage;
import testDataType.Customer;

public class ContactUsPageSteps {

	TestContext testContext;
	ContactUsPage contactUsPage;

	public ContactUsPageSteps(TestContext context) {
		testContext = context;
		contactUsPage = testContext.getPageObjectManager().getContactUsPage();
	}

	@Then("^enter \"([^\"]*)\" details on contact us page$")
	public void enter_details_on_contact_us_page(String customerName) throws Throwable {

		contactUsPage.getInTouch();

		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		contactUsPage.fill_customerDetails(customer);


	}

}
