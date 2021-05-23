package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.BusinessEssentialsPage;
import pageObjects.BusinessSuitePage;
import pageObjects.CityNationalBankPage;
import pageObjects.CityNationalOnlinePage;
import pageObjects.ContactUsPage;
import pageObjects.ForgotPasswordPage;
import pageObjects.ForgotUserIDPage;
import pageObjects.HomePage;

public class PageObjectManager {

	private WebDriver driver;

	private BusinessEssentialsPage businessEssentials;
	private BusinessSuitePage businessSuite;
	private CityNationalBankPage cityNationalbank;
	private CityNationalOnlinePage cityNationalOnline;
	private ContactUsPage contactUsPage;
	private ForgotPasswordPage forgotPassword;
	public ForgotUserIDPage forgotUserID;
	private HomePage homePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public BusinessEssentialsPage getBusinessEssentials() {
		return (businessEssentials == null ? businessEssentials = new BusinessEssentialsPage(driver)
				: businessEssentials);
	}

	public BusinessSuitePage getBusinessSuite() {
		return (businessSuite == null ? businessSuite = new BusinessSuitePage(driver) : businessSuite);
	}

	public CityNationalBankPage getCityNationalBank() {
		return (cityNationalbank == null ? cityNationalbank = new CityNationalBankPage(driver) : cityNationalbank);
	}

	public CityNationalOnlinePage getCityNationalOnlinePage() {
		return (cityNationalOnline == null ? cityNationalOnline = new CityNationalOnlinePage(driver)
				: cityNationalOnline);
	}

	public ContactUsPage getContactUsPage() {
		return (contactUsPage == null ? contactUsPage = new ContactUsPage(driver) : contactUsPage);
	}

	public ForgotPasswordPage getForgotPasswordPage() {
		return (forgotPassword == null ? forgotPassword = new ForgotPasswordPage(driver) : forgotPassword);
	}
	
	public ForgotUserIDPage getForgotUserIDPage() {
		return (forgotUserID == null ? forgotUserID = new ForgotUserIDPage(driver) : forgotUserID);
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

}
