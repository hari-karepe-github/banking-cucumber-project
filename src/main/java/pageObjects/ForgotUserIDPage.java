package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dataProfiders.PropConfigs;

public class ForgotUserIDPage {

	WebDriver driver;

	public ForgotUserIDPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div[1]/p[1]")
	private WebElement forgotUserIDText;

	@FindBy(how = How.XPATH, using = "//*[@id='UserEmail']")
	private WebElement UserEmail;

	@FindBy(how = How.ID, using = "forgotUserId_Submit")
	private WebElement forgotUserId_Submit;

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div[1]/div")
	private WebElement forgotUserId_errorMsg;

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div[2]/form/div[2]/a")
	private WebElement cancel_btn;

	public void forgetUserIDText() {
		Assert.assertTrue(driver.getTitle().equals("City National Online - Forgot User Id Page"),
				"validating Forgot User Id Page");
		Assert.assertTrue(forgotUserIDText.getText().equals("Forgot User ID"), "validating Forgot User ID");
	}

	public void UserEmail(String email) {
		UserEmail.clear();
		UserEmail.sendKeys(email);
	}

	public void forgotUserId_Submit() {
		forgotUserId_Submit.click();
	}

	public void forgotUserId_errorMsg() {
		Assert.assertTrue(forgotUserId_errorMsg.getText().equals("Error: Please contact us to access your account."),
				"validating 'Forgot User ID' Error");
	}

	public void cancel_btn() {
		cancel_btn.click();
	}

	public void enterUserDetails() {		

		UserEmail(PropConfigs.getConfig().getProperty("userEmail"));
	}

}
