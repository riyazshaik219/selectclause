package com.qa.calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJS {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement date= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		String dateval="30/11";
		selectDateByJS(driver,date,dateval);
}
	
	public static void selectDateByJS(WebDriver driver,WebElement element,String dateval) {
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
		
		
	}
}
