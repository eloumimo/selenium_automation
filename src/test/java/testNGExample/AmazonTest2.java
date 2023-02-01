package testNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest2 {

	WebDriver driver;
	//Thread.sleep(4000);
	//System.out.println("close app");
	//driver.close();
	//}
	
	
	
	@BeforeTest
    public void launchApp() {
        
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.Amazon.in");
        
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(4000);
        driver.close();
        
    }
	
	

	@Test(priority = -1)
	public void verifyApplicationTitle() {

		String actualTitle = driver.getTitle();
		System.out.println("Application title: " + actualTitle);
		String expectedTitle = "iphone 14";

//      if(actualTitle.equals(expectedTitle)) {
//          
//          System.out.println("validation pass");
//      }
//      else {
//          
//          System.out.println("validation failed");
//      }

	}

	@Test
	public void searchItem() {

		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 14");

		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	}

	@Test(priority = 1)
	public void verifyApplicationTitleAfterSearch() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.in : iphone 14";
		System.out.println("Application title: " + actualTitle);

		Assert.assertEquals(actualTitle, expectedTitle); // pass else failed

	}

}