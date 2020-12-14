package com.qa.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownpart3 {
public static void main(String[] args) {
	WebDriver  driver = new FirefoxDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	List<WebElement>Total=driver.findElements(By.tagName("select"));
	System.out.println(Total.size());
	
	for(int i=0;i<Total.size();i++) {
		System.out.println(Total.get(i).getText());
	}
}
}
