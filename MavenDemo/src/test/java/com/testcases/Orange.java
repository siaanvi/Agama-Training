package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
//		WebDriver driver= new InternetExplorer();
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id=\'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id=\'txtPassword\']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id=\'btnLogin\']")).click();
	//contains and text
	//driver.findElement(By.xpath(xpathExpression))
	}

}

