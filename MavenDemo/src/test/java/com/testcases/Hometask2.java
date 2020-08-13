package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hometask2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);	
		driver.get("https://m.redbus.in/");
		driver.getTitle();
		driver.findElement(By.xpath("//input[@id=\'src\']")).sendKeys("Che");
		Thread.sleep(3000);
	    Actions action =new Actions(driver);
	    action.sendKeys(Keys.DOWN).perform();
	    action.sendKeys(Keys.DOWN).perform();
	    action.sendKeys(Keys.DOWN).perform();
	  	    
	    action.sendKeys(Keys.ENTER).perform();
	   

	    
	    
	}

}
