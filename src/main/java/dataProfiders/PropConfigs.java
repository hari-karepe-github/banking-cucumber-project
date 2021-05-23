package dataProfiders;

import java.io.InputStream;
import java.util.Properties;

public class PropConfigs extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7626278560072095383L;
	private static PropConfigs instance;

	private PropConfigs() {
		try (InputStream input = this.getClass().getClassLoader().getResourceAsStream("testData/user.properties")) {
			super.load(input);
			input.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static PropConfigs getConfig() {
		if (instance == null) {
			synchronized (PropConfigs.class) {
				if (instance == null) {
					instance = new PropConfigs();
				}

			}
		}
		return instance;
	}

	public String getProperty(String key) {
		return super.getProperty(key);
	}

}
