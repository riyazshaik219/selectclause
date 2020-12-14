package com.qa.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPart2 {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement ele=driver.findElement(By.tagName("select"));
		Select select = new Select(ele);
		
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			String listText=list.get(i).getText();
			System.out.println(listText);
			
			if(listText.equals("Egypt")) {
				list.get(i).click();
				break;
				
			}
		}
	}
}
