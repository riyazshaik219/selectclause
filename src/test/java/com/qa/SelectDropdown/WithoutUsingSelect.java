package com.qa.SelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WithoutUsingSelect {

	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	public void dropdownTest() throws InterruptedException {
		WebElement skillsDropdown=driver.findElement(By.id("Skills"));
		skillsDropdown.click();
		List<WebElement> values=driver.findElements(By.cssSelector("#Skills>option"));
		System.out.println(values.size());
		for(int i=0;i<values.size();i++) {
			/*if(values.get(i).getText().equals("CSS")) {
				values.get(i).click();
				break;
			}*/
			values.get(i).click();
				
			}
		}
	
		
		
		
		
}
