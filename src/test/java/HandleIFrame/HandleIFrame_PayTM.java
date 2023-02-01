package HandleIFrame;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import SmokeTest.BaseTest;

public class HandleIFrame_PayTM extends BaseTest{
    
    
    @Test
    public void verifySignFeature() throws InterruptedException {
        
        Thread.sleep(4000);
        //Click on Sign
        driver.findElement(By.xpath("//span[text()='Sign In']")).click();               
        
        
        
        //handle frame
        //index ---- start from 0
        //driver.switchTo().frame(0);
        
        //name/id
        //driver.switchTo().frame("name/id");
        
        //WebElement myFrame =driver.findElement(By.xpath("//iframe[contains(@src,'paytm')]"));
        WebElement myFrame =driver.findElement(By.tagName("iframe"));
        
        //WebElement 
        driver.switchTo().frame(myFrame);
        
        
        
        WebDriverWait wait = new WebDriverWait(driver, 30);      //maximum time, before throw an exception
        //element present with in sec ---- it perform an action
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".heading")));
        
        
        
        String actualFrameText = driver.findElement(By.cssSelector(".heading")).getText();
        System.out.println(actualFrameText);
        
        //watch video ----- click
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[contains(text(),'Watch Vi')]")).click();
        
        Assert.assertTrue(actualFrameText.contains("Paytm Web account"), "Validation of Frame text get failed.......");
        
    }
    
    
    
    
    

}
