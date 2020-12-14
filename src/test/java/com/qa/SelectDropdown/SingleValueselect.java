package com.qa.SelectDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SingleValueselect {

	 @Test
	public void selectclause() throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Select");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement singledropdown=driver.findElement(By.id("countriesSingle"));
		Select select = new Select(singledropdown);
		
		List<WebElement> values=select.getOptions();
		System.out.println(values.size());
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
			
		}
		
		driver.quit();
		}
		
		
	}
	

