package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayementGateway {
	/*WebDriver driver;
	@Given("The URL of the TestMe App {string}")
	public void the_URL_of_the_TestMe_App(String URL) {
		System.setProperty("webdriver.driver.chrome", "src/test/resources/drivers/chromedriver.exe");
	    
	}

	@When("User clicks on SignIn")
	public void user_clicks_on_SignIn() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	   
	}

	@When("User enters {string} as Username")
	public void user_enters_as_Username(String Username) {
	    driver.findElement(By.id("userName")).sendKeys("Sowjisow");
	}

	@When("User enters {string} as PassWord")
	public void user_enters_as_PassWord(String PassWord) {
	   driver.findElement(By.id("password")).sendKeys("ABCde");
	}

	@When("User clicks on Login")
	public void user_clicks_on_Login() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	   
	}

	@When("User searches for product {string}")
	public void user_searches_for_product(String HeadPhone) {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("HeadPhone");
	    
	}

	@When("User clicks on FINDETAILS")
	public void user_clicks_on_FINDETAILS() {
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
	    
	}

	@When("User tries to proceed to payement without adding any item in the cart")
	public void user_tries_to_proceed_to_payement_without_adding_any_item_in_the_cart() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
	    
	}

	@Then("TestMe app doesn't display the cart icon")
	public void testme_app_doesn_t_display_the_cart_icon() {
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).isDisplayed();
	   
	}




}
