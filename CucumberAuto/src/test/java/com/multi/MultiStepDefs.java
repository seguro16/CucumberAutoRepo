package com.multi;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MultiStepDefs {
	
	WebDriver driver=null;
	
	
	@Given ("^User needs to be on the homepage$")
	public void user_needs_to_be_on_the_homepage(){
	
		
	     // maximized the browser window
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	     //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("https://www.geographicsolutions.com/");
		
	}

	@Given ("^User needs to be on the homepage \"([^\"]*)\"$")
	public void user_needs_to_be_on_the_homepage_xxx(String url){


	       driver.get(url);
		
	}
	
 
    
	@When ("^User enters a value on search field$")
	public void user_enters_a_value_on_search_field(){
	
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("David");
		
	}
	
	
	@Then ("^User checks the search value is present$")
	public void user_checks_the_search_value_is_present(){
		
		String userNameActual =driver.findElement(By.xpath("//input[@aria-label='Search']")).getAttribute("value");
		Assert.assertEquals("David",userNameActual);
		
		
		
	}
	
	@And ("^User selects \"([^\"]*)\" from the \"([^\"]*)\" dropdown menu$")
	public void user_checks_user_first_name_is_present1(String option, String xmenu)  {
		
			

		driver.findElement(By.xpath("//a[contains(text(),'" + xmenu +"')]")).click();
	
		driver.findElement(By.xpath("(//*[@class='dropdown-menu']//*[text()='" + option + "'])")).click();
		
		
	}
	
	@And ("^User clicks the \"([^\"]*)\" link$")
	public void user_clicks_the_xxx_link(String option, String link)  {
		
		driver.findElement(By.xpath("//a[contains(text(),'" + link +"')]")).click();
				
	}
	
	
    @And ("^User pauses the test$")
    public void user_pauses_the_test()  {
        
        // create the object
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setVisible(false);

        JOptionPane.showMessageDialog(frame, "Paused the Test.  Press OK button to continue.");
    }
	
	@And ("^Close driver$")
	public void close_driver() {
		System.out.println("closing webdriver");
		driver.quit();
		driver = null;
	}
	
	
	
}
