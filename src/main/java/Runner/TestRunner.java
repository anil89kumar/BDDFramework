package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		      features = "F://backup//EclipseO2//eclipse-workspace//FreeCRMBDDFreamework//src/main//java/Features//taggedHooks.feature" ,
		        	
		      glue={"stepDefinitions"},   // Package name where stepDefinition file is located 
		      
		     plugin= {"pretty", "html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //report is generated in different formats
		      
		     monochrome=true,  //display the console output in a proper readable format
		      
		      strict=true,   //to check if some steps are not defined in the StepDefinition class
		      
		      dryRun =false // dryRun=true =>to check mapping is proper between feature file and stepDefinition class	
		      
		      //tags = {"@SmokeTest"}  //run only those scenarios associated with @SmokeTest
		      
		     // tags = {"@SmokeTest, @RegressionTest"} // //run  scenarios associated with @SmokeTest OR  @REgressionTest
		      
		      //tags = {"@SmokeTest", "@RegressionTest"}  // run  scenarios associated with @SmokeTest AND @RegressionTest
		      
		      //tags = {"~@SmokeTest", "@RegressionTest"}  //DO NOT run(skip or ignore) @SmokeTest scenarios/TC's, run only @REgression TC's/scenarios
		      
		     // tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"}  //DO NOT run(skip or ignore) @SmokeTest, @RegressionTest and @@End2End scenarios/TC's, run only without any tag TC's/scenarios
		      
		      
		      
		)

public class TestRunner {

}
