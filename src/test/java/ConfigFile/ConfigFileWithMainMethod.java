package ConfigFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigFileWithMainMethod {

	public static void main(String[] args) throws Exception {
		

		
		FileInputStream fis = new FileInputStream("./data/config.properties");
	
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		
		
		//get the content from peroperties file
		
		System.out.println("Application URL: " +prop.getProperty("appURL_QA"));
		System.out.println("userName" + prop.getProperty("userName"));
		System.out.println("password" +prop.getProperty("password"));
		System.out.println("browser details : " + prop.getProperty("browser"));
		

	}

	
	
}
