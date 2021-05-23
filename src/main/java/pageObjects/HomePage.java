package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import dataProfiders.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage {

	WebDriver driver;
	ConfigFileReader configFileReader;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	public void navigateTo_HomePage() {

		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

}
