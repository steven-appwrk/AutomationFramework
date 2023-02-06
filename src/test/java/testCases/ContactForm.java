package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import base.BaseTest;

public class ContactForm extends BaseTest{
	@Test
	public void contactUs() {

		driver.findElement(By.xpath(loc.getProperty("contact_us"))).click();
		driver.findElement(By.xpath(loc.getProperty("name"))).sendKeys(inp.getProperty("name"));
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys(inp.getProperty("email"));

		Select sl = new Select(
				driver.findElement(By.xpath(loc.getProperty("pin_code"))));
		sl.selectByVisibleText("United States (+ 1)");

		driver.findElement(By.xpath(loc.getProperty("phone_number"))).sendKeys(inp.getProperty("number"));
		driver.findElement(By.xpath(loc.getProperty("website"))).sendKeys(inp.getProperty("web"));
		driver.findElement(By.xpath(loc.getProperty("help_textbox"))).sendKeys(inp.getProperty("text"));
//		driver.findElement(By.xpath(loc.getProperty("submit")))
//				.click();
	
	}



}
