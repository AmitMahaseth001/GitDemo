package StepDefinitions;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.Switchtwindow;
import utils.TestContextSetup;

import java.util.Iterator;

public class LandingPagestepdef {

	public WebDriver driver;
	public String Lpage;
	TestContextSetup testcontextsetup;
public LandingPagestepdef(TestContextSetup testcontextsetup)
{
	this.testcontextsetup=testcontextsetup;
}

	@Given("user is on landing page")

	public void user_is_on_landing_page() throws InterruptedException {

		testcontextsetup.driver = new ChromeDriver();
		testcontextsetup.driver.manage().window().maximize();
		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		testcontextsetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@When("user searching for a product {string}")
	public void user_searching_for_a_product(String item) throws InterruptedException {
	   
		testcontextsetup.driver.findElement(By.className("search-keyword")).sendKeys(item);
		Thread.sleep(2000);
	    
	}

	
	@Then("Product should be displayed")
	public void product_should_be_displayed() {

		Lpage = testcontextsetup.driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split("-")[0].trim();

		System.out.println(Lpage);
	}
	
	

	}
