package testRunnr;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//failsafe
@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/anotherFeature.feature",
		glue="stepDefinition",
		dryRun=false,
		plugin= {"html:./reports/myhtmlreport.html"
				,"json:./reports/myjsonreport.json"
		}
		
	    
		
		)


public class TestRunner {

}
