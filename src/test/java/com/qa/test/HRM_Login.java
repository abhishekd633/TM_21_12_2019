package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class HRM_Login {

	@Test
	
	public void login()
	{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Abishek\\Desktop\\Selenium\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
     //comment Text Text
     
     //twsr
     
     
    }

}
