package pageObjects;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dataProfiders.PropConfigs;

public class BusinessEssentialsPage {

	public BusinessEssentialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='essentials']/span")
	private WebElement BusinessEssentials;

	@FindBy(how = How.ID, using = "UserId")
	private WebElement userId;

	@FindBy(how = How.ID, using = "Password")
	private WebElement password;

	@FindBy(how = How.ID, using = "LoginForm_login_signIn")
	private WebElement signInButton;

	@FindBy(how = How.XPATH, using = "/html/body/section/section/div[1]/div")
	private WebElement ErrorMsg;
	
	@FindBy(how = How.XPATH, using = "//*[@id='LoginForm']/div[2]/a[1]")
	private WebElement forgotUserID;
	
	@FindBy(how = How.XPATH, using = "//*[@id='LoginForm']/div[2]/a[2]")
	private WebElement forgotPassword;
	
	@FindBy(how = How.XPATH, using = "/html/body/section/nav/div[1]/div/div/div/a[3]")
	private WebElement ContactUs;
	
	public void businessEssentials() {

		if (BusinessEssentials.getText().contains("Business Essentials"))
			BusinessEssentials.click();
		else
			throw new ElementNotVisibleException("Business Essentials element not found");
	}

	public void userId(String userID) {
		userId.clear();
		userId.sendKeys(userID);
	}

	public void password(String Password) {
		password.clear();
		password.sendKeys(Password);
	}

	public void signInButton() {
		signInButton.click();
	}

	public void errorMsg() {
		Assert.assertTrue(ErrorMsg.getText().equals(
				"Error: We are unable to process your request. Please try again or contact us if you are unable to sign in."),
				"Login Error");
	}
	
	public void forgotUserID() {
		
		forgotUserID.click();
		
	}
	
	public void forgotPassword() {
		forgotPassword.click();
	}
	
	public void ContactUs() {
		ContactUs.click();
	}
	
	public void entersLoginDetails() {
		userId(PropConfigs.getConfig().getProperty("userId"));
		password(PropConfigs.getConfig().getProperty("password"));
	}

}
