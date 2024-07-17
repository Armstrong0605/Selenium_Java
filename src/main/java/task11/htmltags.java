package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmltags {
	
	public static void main (String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guvi.in/register");
		
		driver.manage().window().maximize();
		
	// Full Name 
		
	  driver.findElement(By.id("name")).sendKeys("Jenner Armstrong"); // by id
	  
	 /* driver.findElement(By.className("form-control")); // class name
	  
	  driver.findElement(By.tagName("input"));   // tag name
	  
	  driver.findElement(By.cssSelector("input.form-control")); // CSS selector
	  
	  driver.findElement(By.xpath("//input[@id='name']"));  // X Path  */
	  
	// E Mail Id
	  
	 driver.findElement(By.id("email")).sendKeys("jennerarmstrong@gmail.com");  // ID
	 
	/* driver.findElement(By.className("form-control")); // class name
	 
	 driver.findElement(By.tagName("input")); // tag name
	 
	 driver.findElement(By.cssSelector("input#email")); // css selector
	 
	 driver.findElement(By.xpath("//input[@id='email']")); // X path */
	 
	 // Password 
	 
	 driver.findElement(By.id("password")).sendKeys("Jenner123@");  // ID
	 
   /* driver.findElement(By.className("form-control")); // Class name
      
      driver.findElement(By.tagName("input"));   // tag name
      
      driver.findElement(By.cssSelector("input#password")); // CSS
      
      driver.findElement(By.xpath("//input[@id='password']")); // X Path
      
	 */
	 
	 // Mobile number
	 
	 driver.findElement(By.id("mobileNumber")).sendKeys("8754645405");
	 
  /* driver.findElement(By.className("form-control")); // class name
   
     driver.findElement(By.tagName("input"));    // Tag name
     
     driver.findElement(By.cssSelector("input.form-control.countrycode-left")); // CSS 
     
     driver.findElement(By.xpath("//input[@id='mobileNumber']")); // X path
	  
	  */
	 
	 // Sign up button
	 
	 driver.findElement(By.id("signup-btn")).click();
	 
	/* driver.findElement(By.className("form-control")); // Class name
	 
	 driver.findElement(By.tagName("input"));   // tag name
	 
	 driver.findElement(By.cssSelector("input#mobileNumber"));  // CSS selector

	 driver.findElement(By.xpath("//input[@id='mobileNumber']"));   // X Path
     
     */

	  

	}

}
