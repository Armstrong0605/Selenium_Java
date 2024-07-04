package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demoblaze {

	public static void main(String[] args ) 
	{
		
	
	// Launch the Browser
	WebDriver driver = new ChromeDriver();
	// To open Google Page
	driver.get("https://www.google.com/");
	// To Maximize the Window
	driver.manage().window().maximize();
	// To open Selenium Driver
	driver.get("https://www.demoblaze.com/");
	
	String expectedTitle="Store";
	String actualTitleString = driver.getTitle();
	
	if(expectedTitle.equalsIgnoreCase(actualTitleString))
	{
		System.out.println("Page Landed on correct Website");
	} else 
	{
		System.out.println("Page not Landed on Correct Website");
	}
	// To close the driver
	// driver.close();
	
}
	
}
