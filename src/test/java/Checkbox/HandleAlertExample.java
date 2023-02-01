package Checkbox;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import SmokeTest.BaseTest;

public class HandleAlertExample extends BaseTest {

	// @Test
	public void verifySimpleAlert() throws InterruptedException {

		driver.findElement(By.cssSelector("input[value*='Alert']")).click(); // perform action on first one

		// ALert/Window/Frame ------- driver.switchTo()

		// handle Alert

		Alert simpleAlert = driver.switchTo().alert();

		// accept/dismiss/getText/sendkeys

		String acutalAlertText = simpleAlert.getText();
		String expectedLAertText = "Hi.. This is alert message!";

		Thread.sleep(5000);

		// click OK button
		simpleAlert.accept();

		// click on Cancel button or esc key
		// simpleAlert.dismiss();

		System.out.println("Alert Text: " + acutalAlertText);
		Assert.assertEquals(acutalAlertText, expectedLAertText);
		Assert.assertEquals(acutalAlertText, "Hi.. This is alert message!", "Validation of Alert text get failed.");

		// acutalAlertText.contains("alert message");
		Assert.assertTrue(acutalAlertText.contains("alert message!!"), "Validation of Alert text get failed.......");

	}

	@Test
	public void verifyConfirmAlert() throws InterruptedException {

		// Click on Confirm button
		driver.findElement(By.xpath("//button[contains(text(),'Conf')]")).click(); // perform action on first one

		// ALert/Window/Frame ------- driver.switchTo()

		// handle Alert

		Alert confirmAlert = driver.switchTo().alert();

		// accept/dismiss/getText/sendkeys

		String acutalAlertText = confirmAlert.getText();
		String expectedLAertText = "Press 'OK' or 'Cancel' button!";

		Thread.sleep(5000);

		// click OK button
		// confirmAlert.accept();

		// click on Cancel button or esc key
		confirmAlert.dismiss();

		System.out.println("Alert Text: " + acutalAlertText);
		Assert.assertEquals(acutalAlertText, expectedLAertText);
		// acutalAlertText.contains("alert message");
		Assert.assertTrue(acutalAlertText.contains("'OK' or 'Cancel'"), "Validation of Alert text get failed.......");

		String canceltext = driver.findElement(By.cssSelector("div#demo")).getText();
		Assert.assertTrue(canceltext.contains("Cancel"), "Perform Cancel button validation failed.......");

	}

}
