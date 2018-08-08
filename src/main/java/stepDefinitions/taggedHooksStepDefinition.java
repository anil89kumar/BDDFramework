package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggedHooksStepDefinition {
	
	//Global Hooks: @Before and @After(will be executed before and after every scenario)
	
	@Before(order=0)  //Ordering of Hooks can also be defined
	
	 public void setup() {
		
		System.out.println("Launch FF");
		System.out.println("Enter URL for Free CRM Application");
		
			
	}
	
	@After(order=0)
	
	public void tearDown() {
		
		System.out.println("close the browser");	
		
	}
	
	@Before(order=1)
	
	 public void setup1() {
		
		System.out.println("Launch FF1");
		System.out.println("Enter URL for Free CRM Application");
		
			
	}
	
	@After(order=1)
	
	public void tearDown1() {
		
		System.out.println("close the browser1");	
		
	}
	
     //Local Hooks- only for First Scenario
	
	@Before("@First")
	
	public void beforeFirst() {
		
		System.out.println("Before the First Scenario");
	}
	
    @After("@First")
	
	public void afterFirst() {
		
		System.out.println("After the First Scenario");
	}
	
    //Local Hooks- only for Second Scenario
	
   	@Before("@Second")
   	
   	public void beforeSecond() {
   		
   		System.out.println("Before the Second Scenario");
   	}
   	
       @After("@Second")
   	
   	public void afterSecond() {
   		
   		System.out.println("After the Second Scenario");
   	}
   	
       //Local Hooks- only for Third Scenario
   	
   	@Before("@Third")
   	
   	public void beforeThird() {
   		
   		System.out.println("Before the Third Scenario");
   	}
   	
       @After("@Third")
   	
   	public void afterThird() {
   		
   		System.out.println("After the Third Scenario");
   	}
   	
	@Given("^this is the first step$")
	public void this_is_the_first_step()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^This is the third step$")
	public void this_is_the_third_step()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
