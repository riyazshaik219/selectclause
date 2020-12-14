package com.qa.SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {

	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
	}
	
	@Test(priority=0)
	public void dropdownTest() {
		WebElement ele=driver.findElement(By.id("Skills"));
		Select select=new Select(ele);
		select.selectByVisibleText("Android");
	}
	@Test(priority=1)
	public void dropdownTest2() {
		WebElement ele=driver.findElement(By.id("countries"));
		Select select=new Select(ele);
		select.selectByVisibleText("Angola");
	}
	@Test(priority=2)
	public void dropdownTest3() {
		WebElement ele=driver.findElement(By.id("yearbox"));
		Select select=new Select(ele);
		select.selectByVisibleText("1993");
	}
	
	/*@AfterMethod
	public void tearDown() {
		driver.close();
	}*/
}
