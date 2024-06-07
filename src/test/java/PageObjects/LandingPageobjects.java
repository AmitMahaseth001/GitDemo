package PageObjects;

import org.openqa.selenium.By;

public class LandingPageobjects {
	
	public void Pageobject()
	{
	
	By searchitem=By.className("search-keyword");
	By productname=By.xpath("//h4[@class='product-name']");
	By topdeals=By.xpath("//a[contains(text(),'Top Deals')]");
	
	}
}
