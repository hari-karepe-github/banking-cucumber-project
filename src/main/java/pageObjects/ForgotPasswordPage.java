package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dataProfiders.PropConfigs;

public class ForgotPasswordPage {

	public ForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/div[1]/p[1]")
	private WebElement forgotPassword;

	@FindBy(how = How.ID, using = "UserId")
	private WebElement UserId;

	@FindBy(how = How.ID, using = "UserEmail")
	private WebElement UserEmail;

	@FindBy(how = How.ID, using = "forgotPasswordSubmit")
	private WebElement forgotPasswordSubmit_btn;

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div[1]/div")
	private WebElement errorMsg;

	@FindBy(how = How.XPATH, using = "//*[@id='content']/div[2]/div[2]/form/div[3]/a")
	private WebElement cancel;

	public void forgotPassword() {
		Assert.assertTrue(forgotPassword.getText().equals("Forgot Password"), "validating Forgot Password");
	}

	public void UserId(String userID) {
		UserId.clear();
		UserId.sendKeys(userID);
	}

	public void UserEmail(String Email) {
		UserEmail.clear();
		UserEmail.sendKeys(Email);
	}

	public void forgotPasswordSubmit_btn() {
		forgotPasswordSubmit_btn.click();
	}

	public void erroMsg() {

		Assert.assertTrue(errorMsg.getText().equals("Error: Please contact bank for assistance."),
				"validating Forgot Password error message");
	}

	public void cancel() {
		cancel.click();
	}

	public void enterUserDetails() {

		UserId(PropConfigs.getConfig().getProperty("userId"));
		UserEmail(PropConfigs.getConfig().getProperty("userEmail"));
	}

}
