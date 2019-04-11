package com.multi;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class UrlStepDefs {
	
	WebDriver driver=null;
	

	
	
	
	

	@Given ("^User needs to be on the homepage2 \"([^\"]*)\"$")
	public void user_needs_to_be_on_the_homepage2_xxx(String url){

		
	     // maximized the browser window
		System.setProperty("webdriver.chrome.driver", "C:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(url);
	   
		
	}
	
 
   
	
    @And ("^User pauses the test2$")
    public void user_pauses_the_test2()  {
        
        // create the object
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setVisible(false);

        JOptionPane.showMessageDialog(frame, "Paused the Test.  Press OK button to continue.");
    }
	
	@And ("^Close driver1$")
	public void close_driver() {
		System.out.println("closing webdriver");
		driver.quit();
		driver = null;
	}

	
}
