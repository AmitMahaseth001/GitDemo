package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Switchtwindow {
	
	public  Switchtwindow(WebDriver driver)
	{
		
		if(driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		Set<String> wind = driver.getWindowHandles();

		Iterator<String> it = wind.iterator();
		String Parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
	}
	
	
	

}
