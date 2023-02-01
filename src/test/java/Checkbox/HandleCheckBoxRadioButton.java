package Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBoxRadioButton {
	WebDriver driver;
	
	@BeforeTest

	public void launchApp() {
		driver = WebDriverManager.chromedriver().create();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(4000);
		driver.close();
	}

	@Test
	public void verifyCheckbox() {
		driver.findElement(By.xpath("//input[@name='vehicle']")).click();
	}

	@Test
	public void verifyRadioButton() {
		driver.findElement(By.cssSelector("input[value='female']")).click();
		driver.findElement(By.xpath("//option[@value='India']")).click();
	}

	@Test
	public void verifyComboBox() {
		driver.findElement(By.xpath("//option[@value='India']")).click();
	}
	
	
}