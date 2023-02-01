package ReadExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigExample {

	Properties prop;

	public ConfigExample() throws Exception {

		FileInputStream fis = new FileInputStream("./data/config.properties");

		prop = new Properties();

		prop.load(fis);

		// prop.getProperty("");

	}

	public String getAppURL() {

		return prop.getProperty("appURL_QA");
	}

	public String  getUserName() {

		String user = prop.getProperty("userName");
		return user;
	}
	
	public String  getPassword() {

		String user = prop.getProperty("password");
		return user;
	}
	
	public String  getbrowser() {

		String user = prop.getProperty("browser");
		return user;
	}

}
