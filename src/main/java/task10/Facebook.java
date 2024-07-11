package task10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main (String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Account User Login Successfull");
		
		
		
	}
}
