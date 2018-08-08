package stepDefinitions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert; 




public class LoginStepDefinition {
	
	//WebDriver driver;
	
		
//	@Given("^user is already at Login Page$")
//	
//	public void  user_aleady_at_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "F:\\backup\\Rajesh Selenium Installer\\Selenium Installations\\Selenium 3.8\\Chrome Driver\\chromedriver.exe");	
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.freecrm.com/index.html");
//		
//		
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//	    
//    String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title); //validation    
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	
//	//@Then("^user enters username and password$")
//	
//	public void user_enters_username_and_password(String username, String password)  {
//	    
//	WebElement usernameText = driver.findElement(By.name("username"));
//	usernameText.clear();
//    //usernameText.sendKeys("naveenk");
//	usernameText.sendKeys(username);
//	WebElement passwordText = driver.findElement(By.name("password"));
//	passwordText.clear();
//	//passwordText.sendKeys("test@123");
//	passwordText.sendKeys(password);
//	
//	    
//	}
//
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button()  {
//	    
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		
//		//simply click() won't work here
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", loginBtn);
//		
//		
//	    
//	}
//
//	@Then("^user is on Home Page$")
//	public void user_is_on_Home_Page() {
//		
//		String title = driver.getTitle();
//		System.out.println("Home page title is  :" +title);
//		Assert.assertEquals("CRMPRO", title);
//		//Assert.assertEquals("CRMPRO12", title);   //validation
//	    
//	    
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//	    
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(), 'New Contact')]")).click();
//	    
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	
//	 public void user_enters_contacts_details(String firsname, String lastname, String position) {
//		driver.findElement(By.id("first_name")).sendKeys(firsname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		
//	}
//
//
//	@Then("^close the browser$")	
//	
//	public void close_the_browser() {
//		
//		driver.quit();
//	}
//	

}
