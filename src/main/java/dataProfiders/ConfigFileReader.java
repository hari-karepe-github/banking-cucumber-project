package dataProfiders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enms.DriverType;
import enms.EnvironmentType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "src/test/resources/testData/Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getChromeDriver() {
		String chromeDriver = properties.getProperty("chromeDriver");
		if (chromeDriver != null)
			return chromeDriver;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String getDriverPath() {

		String driverPath;

		if (System.getProperty("os.name").contains("Windows")) {
			driverPath = properties.getProperty("driverPath");
			if (driverPath != null)
				return driverPath;
			else
				throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		} else if (System.getProperty("os.name").contains("Mac")) {
			driverPath = properties.getProperty("macDriverPath");

			String home = System.getProperty("user.home");
			File f = new File(home + driverPath);

			if (driverPath != null) {

				if (f.exists()) {
					return home + driverPath;

				} else {
					System.err.println("chrome driver does not Exists in folder /Downloads/");
					System.exit(0);
				}

			}

			else
				throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		} else {
			System.err.println("os is not compatible");
			System.exit(0);
		}
		return null;
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else if (browserName.equals("edge"))
			return DriverType.EDGE;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public String getTestDataResourcePath() {
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException(
					"Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
	}

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

}
