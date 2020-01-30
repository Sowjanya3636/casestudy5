package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintestme {
/*WebDriver driver;
	
	@Given("The URL of the TestMe App {string}")
	public void the_URL_of_the_TestMe_App(String URL) {
		System.setProperty("web.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	   
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

	@Then("User clicks on Login")
	public void user_clicks_on_Login() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	   
	}

	@When("User searches for product {string}")
	public void user_searches_for_product(String Searchproduct) {
        driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("HeadPhone");
	}

	@When("User clicks on FINDETAILS")
	public void user_clicks_on_FINDETAILS() {
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
   
	}

	@Then("User clicks on ADDTOCART")
	public void user_clicks_on_ADDTOCART() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
   
	}






}
