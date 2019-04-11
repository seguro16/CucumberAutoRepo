package com.sharedSD;

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



public class SharedStepDefs {
	
	WebDriver driver;
	
	public SharedStepDefs(SharedDriver share){
		driver = share.Setup();
	}
	

	@Given ("^User needs to be on the homepage2 \"([^\"]*)\"$")
	public void user_needs_to_be_on_the_homepage2_xxx(String url){

		driver.get(url);
	     // maximized the browser window
	    
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
	
	
	
	
}
