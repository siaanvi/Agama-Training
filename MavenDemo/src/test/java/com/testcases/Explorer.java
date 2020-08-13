package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
       // driver.navigate().to("https://www.google.com/");	
      	//driver.navigate().back();	
      //  System.out.println(driver.getTitle());
		

	}

}
