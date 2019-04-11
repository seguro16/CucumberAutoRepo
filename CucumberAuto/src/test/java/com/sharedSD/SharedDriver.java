package com.sharedSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedDriver {
	
	WebDriver driver;
	
	@Before
	public WebDriver Setup(){
		if(driver==null){
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void cleanUp() throws InterruptedException
	{
		 driver.manage().window().maximize();
		System.out.println("closing webdriver");
		driver.quit();
		//driver=null;
	}
	

}
