package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import selenium.Wait;
import testDataType.Customer;

public class ContactUsPage {

	WebDriver driver;
	Wait wait;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='hero-0efd672c1a']/div/div[2]/h1")
	private WebElement contactUsText;

	@FindBy(how = How.XPATH, using = "//*[@id='hero-0efd672c1a-cta-2d93bfeb50']")
	private WebElement getInTouch;

	@FindBy(how = How.ID, using = "contactName")
	private WebElement contactName;

	@FindBy(how = How.ID, using = "contactCompany")
	private WebElement contactCompany;

	@FindBy(how = How.ID, using = "contactEmail")
	private WebElement contactEmail;

	@FindBy(how = How.ID, using = "phone")
	private WebElement phone;

	@FindBy(how = How.ID, using = "contactZip")
	private WebElement contactZip;

	@FindBy(how = How.XPATH, using = "//*[@id='interest']")
	private WebElement interest;

	@FindBy(how = How.ID, using = "contactMessage")
	private WebElement contactMessage;

	@FindBy(how = How.NAME, using = "submit")
	private WebElement submit;

	@FindBy(how = How.XPATH, using = "//*[@id='container-25e2854b65']/div/div/div/div/div[2]")
	private WebElement submitMessage;

	public void contactUsText() {
		Assert.assertTrue(contactUsText.getText().equals("CONTACT US"));
	}

	public void getInTouch() {
		getInTouch.click();
	}

	public void contactName(String Name) throws InterruptedException {

		Thread.sleep(2000);
		contactName.clear();
		contactName.sendKeys(Name);
	}

	public void contactCompany(String company) {
		contactCompany.clear();
		contactCompany.sendKeys(company);
	}

	public void contactEmail(String Email) {
		contactEmail.clear();
		contactEmail.sendKeys(Email);
	}

	public void phone(String Phone) {
		phone.clear();
		phone.sendKeys(Phone);
	}

	public void contactZip(String ZIPCode) {
		contactZip.clear();
		contactZip.sendKeys(ZIPCode);
	}

	public void interest(String InterestedIn) {
		Select interstedIn = new Select(interest);
		interstedIn.selectByValue(InterestedIn);
	}

	public void contactMessage(String msg) throws InterruptedException {
		contactMessage.sendKeys(msg);
		Thread.sleep(2000);
	}

	public void submit() {
		submit.click();
	}

	public void submitMessage() {
		wait.until(driver, submitMessage.isDisplayed());
		Assert.assertTrue(submitMessage.getText().contains(
				"Thank you for getting in touch. A City National representative will respond to your inquiry. In the meantime, check out our latest news and insights."),
				"validating ContactUS Message");
	}

	public void fill_customerDetails(Customer customer) throws InterruptedException {
		contactName(customer.customerName);
		contactCompany(customer.company);
		contactEmail(customer.email);
		phone(customer.phone);
		contactZip(customer.zipCode);
		interest(customer.interestedIn);
		contactMessage(customer.message);

	}

}
