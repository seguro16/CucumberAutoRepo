package com.multi;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags={"@Important"},
		//tags={"@Smoke"},
		//tags={"@Smoke","@Regression"}, //and condition
		//tags={'@Smoke, @Regression'}, //or condition
		dryRun=false,
		features= {"src/test/resources/com/multi/"},
		
		glue={"com/multi/"},
		
		plugin = { "pretty", 
					"junit:target/cucumber-results.xml",
					"html:target/cucumber-htmlreport",
					"html:target/cucumber-reportMulti.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				},

monochrome = true
)


public class RunMultiTest {
	
	

	
	
	

}
