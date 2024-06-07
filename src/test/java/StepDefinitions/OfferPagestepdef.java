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

public class OfferPagestepdef {
	TestContextSetup testcontextsetup;
	
	public OfferPagestepdef(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	
	public String ofrpage;
	
	@Then("user should see {string} item on Top deals page")
	public void user_should_see_item_on_top_deals_page(String Itemname) throws InterruptedException {
		testcontextsetup.driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();

		Switchtwindow s1 = new Switchtwindow(testcontextsetup.driver);
		testcontextsetup.driver.findElement(By.id("search-field")).sendKeys(Itemname);
		Thread.sleep(2000);
		ofrpage = testcontextsetup.driver.findElement(By.xpath("//tbody/tr/td[1]")).getText();
		
		System.out.println(ofrpage + " "+testcontextsetup.Lpage);
	}
	@Then("Verify both item name is same")
	public void Verify_both_item_name_is_same()
	{
		Assert.assertEquals(testcontextsetup.Lpage, ofrpage);
	}

	}
