package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CityNationalBankPage {

	public CityNationalBankPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='image-476453aa5c']/a/img")
	private WebElement signIn_Image;

	@FindBy(how = How.XPATH, using = "//*[@id='button-571f164918']")
	private WebElement signIn_Button;

	public void signIn_Image() {
		Assert.assertTrue(signIn_Image.getAttribute("title").equals("City National Bank Logo"), "validating City National Bank Logo");
	}

	public void signInButton() {
		signIn_Button.click();
	}

}
