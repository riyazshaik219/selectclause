package com.qa.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericFunctionSelectClause {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		
		selectDropDownValue(country, "index", "5");
		selectDropDownValue(industry, "value", "Education");
		
		
		
		}
	public static void selectDropDownValue(By locator,String type,String value) {
		
		Select select = new Select(getElement(locator));
		
		switch(type) {
		case "index" :
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value" :
			select.selectByValue(value);
			break;
		case "visibletext" :
			select.selectByVisibleText(value);
			break;
			default:
				System.out.println("please pass the correct selection criteria...");
				break;
		
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
