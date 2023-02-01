package SmokeTest;

//package crossBrowserTest;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import utility.ConfigExample;

public class Logintest {
  
  WebDriver driver ;
  
  @Test
  public void verifyLoginTest() throws Exception {
      
      
      //create an Object
      //ConfigExample conf = new ConfigExample();
      //chrome browser
//    System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
      
      
      //String browser = conf.getbrowser();
      String browser = "chrome";
      
      if(browser.equalsIgnoreCase("chrome")) {
          
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          
      }
      
      else if(browser.equalsIgnoreCase("edge"))
      {
          
          WebDriverManager.edgedriver().setup();
          driver = new EdgeDriver();
          
      }
      
      else {
          
          //default execution on chrome browser
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
          
          WebDriverManager.firefoxdriver().setup();
          driver = new FirefoxDriver();
          
      }
      
      //WebDriver driver = new EdgeDriver();
      
      //edge browser
      //System.setProperty("webdriver.edge.driver","C:\\Users\\Act\\Downloads\\edgedriver_win64\\msedgedriver_100.exe");
      
      
      
      
      
      
      
      System.out.println("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
      
      
      //driver.get(conf.getAppURL());
      driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
      
      //loactor ---- id
      driver.findElement(By.xpath("//*[contains(@name,'mail')]")).clear();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[contains(@name,'mail')]")).sendKeys("admin@yourstore.com");
      
      Thread.sleep(4000);
      //locator - name
      
      WebElement txtPassword = driver.findElement(By.xpath("//input[contains(@type,\"password\")]"));
      txtPassword.clear();
      txtPassword.sendKeys("admin");
      
      //locator - tagname
      WebElement btnLogin = driver.findElement(By.xpath("//button"));
      btnLogin.click();
      
      Thread.sleep(3000);
      //validation step
      String actualApplicationURL = driver.getCurrentUrl();
      String actualApplicationTitle = driver.getTitle();
      
      System.out.println("Application Title: " + actualApplicationTitle);
      System.out.println("actualApplicationURL : " + actualApplicationURL);
      
      //locator - linkText
      //click on Logout link
      driver.findElement(By.xpath("//a[text()='Logout']")).click();
      
      Thread.sleep(4000);
      
      
      //click on Login Button
      //locator - classname
      //driver.findElement(By.className("button-1 login-button")).click();
      //driver.findElement(By.className("button-1")).click();
      driver.findElement(By.xpath("//*[@type='submit']")).click();
      
      Thread.sleep(4000);
      
      //locator - partiallinkText
      //click on Logout link
      driver.findElement(By.xpath("//a[contains(text(),'gou')]")).click();
      
      
      Thread.sleep(4000);
      driver.close();
      //driver.quit();
      
  }
  
  

}

