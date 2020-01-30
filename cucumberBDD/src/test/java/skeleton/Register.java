package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	/*WebDriver driver;
	@Given("The URL of the TestME App {string}")
	public void the_URL_of_the_TestME_App(String URL) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
	    
	}

	@When("User clicks on SignUp")
	public void user_clicks_on_SignUp() {
	   driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	}
	
	@When("User enters {string} as user_name")
	public void user_enters_as_user_name(String user_name) {
		driver.findElement(By.id("userName")).sendKeys("Sowjisow");
	   
	}

	@When("User enters {string} as firstname")
	public void user_enters_as_firstname(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys("Sowji");
	   
	}

	@When("User enters {string} as lastname")
	public void user_enters_as_lastname(String lastname) {
		driver.findElement(By.id("lastName")).sendKeys("sow");
	    
	}

	@When("User enters {string} as Password")
	public void user_enters_as_Password(String pass) {
		driver.findElement(By.id("password")).sendKeys("ABCde");
	    
	}

	@When("User enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String confirmpassword) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("ABCde");
		
	   
	}

	@When("User enters {string} as gender")
	public void user_enters_as_gender(String gender) {
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		
	    
	}

	@When("User enters {string} as email")
	public void user_enters_as_email(String email) {
	    driver.findElement(By.id("emailAddress")).sendKeys("Sowjisow@gmail.com");
	}

	@When("User enters {string} as MobileNumber")
	public void user_enters_as_MobileNumber(String MobileNumber) {
	    driver.findElement(By.id("mobileNumber")).sendKeys("4587931269");
	}

	@When("User enters {string} as dob")
	public void user_enters_as_dob(String dob) {
	    driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("05/05/1997");
	}

	@When("User enters {string} as address")
	public void user_enters_as_address(String address) {
		driver.findElement(By.id("address")).sendKeys("Kakinada");
	    
	}

	@When("User enters {string} as securityquestion")
	public void user_enters_as_securityquestion(String securityquestion) {
	  WebElement sq=  driver.findElement(By.xpath("//select[@id='securityQuestion']"));
	    Select q=new Select(sq);
	    q.selectByValue("411010");
	}

	@When("User enters {string} as Answer")
	public void user_enters_as_Answer(String Answer) {
		driver.findElement(By.id("answer")).sendKeys("kkd");
	    
	}

   @Then("User clicks on Register")
   public void user_clicks_on_Register() {
   driver.findElement(By.xpath("//input[@name='Submit']")).click();
}


	




}
