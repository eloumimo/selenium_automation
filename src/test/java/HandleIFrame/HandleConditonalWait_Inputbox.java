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

public class HandleConditonalWait_Inputbox extends BaseTest{
    
    
    @Test
    public void verifyInputbox3() throws InterruptedException {
        
        
        
        
        WebDriverWait wait = new WebDriverWait(driver, 30);      //maximum time, before throw an exception
        //element present with in sec ---- it perform an action
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
        
        
        
        
        //Click on Sign
        System.out.println("enter value into text box 3");
        driver.findElement(By.cssSelector("#text3")).sendKeys("enter value into textbox3");             
        
        
        
        
        
    }
    
    
    
    
    

}