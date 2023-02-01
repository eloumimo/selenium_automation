package SmokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    
    
public WebDriver driver;
    
    @BeforeTest
    public void launchApp() {
        
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://paytm.com/");
        
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(4000);
        driver.close();
        
    }
    
    
    
    

}
