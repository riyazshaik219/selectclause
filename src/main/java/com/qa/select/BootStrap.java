package com.qa.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrap {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		list.get(i).click();
	
	}
	
	/*for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("Angular")){
list.get(i).click();
break;
		}
	
	}*/
	}
}