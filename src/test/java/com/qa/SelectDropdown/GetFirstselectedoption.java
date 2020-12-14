
package com.qa.SelectDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GetFirstselectedoption {

	@Test
	public void selectclause() throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Select");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.id("countriesSingle"));
		Select select = new Select(element);
		WebElement selectedvalue=select.getFirstSelectedOption();
		System.out.println(selectedvalue.getText());
}
}