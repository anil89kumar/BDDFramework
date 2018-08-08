package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dealStepDefinitions {
	
WebDriver driver;
	
	
	@Given("^user is already at Login Page$")
	
	public void  user_aleady_at_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\backup\\Rajesh Selenium Installer\\Selenium Installations\\Selenium 3.8\\Chrome Driver\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
	    
    String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title); //validation    
	}

	//No need to use any regular expression
	
	@Then("^user enters username and password$")
	
	//We don't need any parameters passed but a DataTable variable
	
	public void user_enters_username_and_password(DataTable credentials)  {
		
  //raw() method initializes the credentials variable and give complete access to the DataTable in the feature file		
		
	List<List<String>> data = credentials.raw(); 
	    
	WebElement usernameText = driver.findElement(By.name("username"));
	usernameText.clear();
    //usernameText.sendKeys("naveenk");
	usernameText.sendKeys(data.get(0).get(0)); //getting data from 0th index of the datatable i.e.naveenk
	WebElement passwordText = driver.findElement(By.name("password"));
	passwordText.clear();
	//passwordText.sendKeys("test@123");
	passwordText.sendKeys(data.get(0).get(1)); //getting data from 1st index of the datatable i.e.test@123
	
	    
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()  {
	    
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		//simply click() won't work here
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", loginBtn);
		
		
	    
	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		
		String title = driver.getTitle();
		System.out.println("Home page title is  :" +title);
		Assert.assertEquals("CRMPRO", title);
		    
	    
	}
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page()  {
		
		//Frame is used hence switch to frame  is used
	    driver.switchTo().frame("mainpanel");
		//doing Mouse hovering on Deals hence Actions class is used
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
	    
	}
	
	@Then("^user enters deal details title and amount and probability and commission$")
	
	public void user_enters_deal_details_title_and_amount_and_probability_and_commission(DataTable dealData) {

		//only 1st set of data will be entered
		//For 2nd set of data we have to come again on deals page and do the same process
		//Hence, Examples keyword approach is better than DataTable approach
		
		List<List<String>> dealValues = dealData.raw();
		
		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		
		
	}


	@Then("^close the browser$")	
	
	public void close_the_browser() {
		
		driver.quit();
	}
	

	

}
