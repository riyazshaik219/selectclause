package com.qa.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver  driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
WebElement ele=driver.findElement(By.id("select-demo"));
		Select select = new Select(ele);
		select.selectByVisibleText("Sunday");
//we have to use selectByVisibleText as it doesn't care about position and indexing even value changes in fu.ture
		//if we use SelectByIndex, there are chances in future modifications can be done
		
	}
}
