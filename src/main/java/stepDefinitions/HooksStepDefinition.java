package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
	
	//Implementing Pre-conditions
	
	@Before
	
	 public void setup() {
		
		System.out.println("Launch FF");
		System.out.println("Enter URL for Free CRM Application");
		
			
	}
	
	
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user fills the deals form$")
	public void user_fills_the_deals_form()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^deal is created$")
	public void deal_is_created()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	//Implementing Post-condition
	
		@After
		
		public void tearDown() {
			
			System.out.println("close the browser");	
			
		}
}
