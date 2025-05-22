package testRunnr;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./Features/anotherFeature.feature",
		glue="stepDefinition",
		dryRun=false,
		plugin= {"html:./reports/myhtmlreport.html"
				,"json:./reports/myjsonreport.json"
		}
		
	    
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}



}
