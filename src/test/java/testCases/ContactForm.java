package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;

public class ContactForm extends BaseTest{
	@Test(dataProvider = "testdata")
	public void contactUs(String name, String email, String number, String web, String text) {

		driver.findElement(By.xpath(loc.getProperty("contact_us"))).click();
		driver.findElement(By.xpath(loc.getProperty("name"))).sendKeys(name);
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys(email);

		Select sl = new Select(
				driver.findElement(By.xpath(loc.getProperty("pin_code"))));
		sl.selectByVisibleText("United States (+ 1)");

		driver.findElement(By.xpath(loc.getProperty("phone_number"))).sendKeys(number);
		driver.findElement(By.xpath(loc.getProperty("website"))).sendKeys(web);
		driver.findElement(By.xpath(loc.getProperty("help_textbox"))).sendKeys(text);
//		driver.findElement(By.xpath(loc.getProperty("submit")))
//				.click();
	
	}
	
	@DataProvider(name = "testdata")
	public Object[][] testData() {
	 return new Object[][] {
	   { "Steven", "s.steven.3115@gmail.com", "7894561230", "appwrk","Test" }
	 };
	}



}
