package Checkbox; 
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import SmokeTest.BaseTest;

public class HandleDropDown extends BaseTest {

	@Test
	public void verifyCountryListBox() throws InterruptedException {

		WebElement listbox = driver.findElement(By.xpath("//select")); // perform action on first one
		// WebElement listbox1 =
		// driver.findElement(By.cssSelector("select[name='FromLB']"));

		// Select class

		Select list = new Select(listbox);

		System.out.println("is listbox accept multiple selection or not: " + list.isMultiple());
		; // false

		Assert.assertFalse(list.isMultiple()); // pass

		// Assert.assertTrue(true); //pass
		// Index ----- start from 0
		list.selectByIndex(1); // Saab

		Thread.sleep(2000);

		list.selectByValue("Singapore"); // Opel
		Thread.sleep(2000);
		list.selectByVisibleText("Toyota"); // Toyota

		Thread.sleep(4000);

	}

	@Test
	public void verifyCarModelListBox() throws Exception {

		WebElement listbox = driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));
		// WebElement listbox1 =
		// driver.findElement(By.cssSelector("select[name='FromLB']"));

		// Select class

		Select list = new Select(listbox);

		System.out.println("is listbox accept multiple selection or not: " + list.isMultiple());
		; // true

		// Index ----- start from 0
		list.selectByIndex(0); // USA

		list.selectByValue("India"); // India

		list.selectByVisibleText("Germany");

		Thread.sleep(4000);

		list.deselectByValue("USA");

		Thread.sleep(2000);

		list.deselectAll();

		Thread.sleep(2000);
		list.selectByValue("India");
	}

}
