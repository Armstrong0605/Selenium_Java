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
	  
	 /* driver.findElement(By.className("form-control")).sendKeys("Jenner Armstrong"); // class name
	  
	  driver.findElement(By.tagName("input")).sendKeys("Jenner Armstrong");   // tag name
	  
	  driver.findElement(By.cssSelector("input.form-control")).sendKeys("Jenner Armstrong"); // CSS selector
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jenner Armstrong");  // X Path  */
	  
	// E Mail Id
	  
	 driver.findElement(By.id("email")).sendKeys("jennerarmstrong@gmail.com");  // ID
	 
	/* driver.findElement(By.className("form-control")).sendKeys("jennerarmstrong@gmail.com"); // class name
	 
	 driver.findElement(By.tagName("input")).sendKeys("jennerarmstrong@gmail.com"); // tag name
	 
	 driver.findElement(By.cssSelector("input#email")).sendKeys("jennerarmstrong@gmail.com"); // css selector
	 
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jennerarmstrong@gmail.com"); // X path */
	 
	 // Password 
	 
	 driver.findElement(By.id("password")).sendKeys("Jenner123@");  // ID
	 
   /* driver.findElement(By.className("form-control")).sendKeys("Jenner123@"); // Class name
      
      driver.findElement(By.tagName("input")).sendKeys("Jenner123@");   // tag name
      
      driver.findElement(By.cssSelector("input#password")).sendKeys("Jenner123@"); // CSS
      
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jenner123@"); // X Path
      
	 */
	 
	 // Mobile number
	 
	 driver.findElement(By.id("mobileNumber")).sendKeys("8754645405");
	 
  /* driver.findElement(By.className("form-control")).sendKeys("8754645405"); // class name
   
     driver.findElement(By.tagName("input")).sendKeys("8754645405");    // Tag name
     
     driver.findElement(By.cssSelector("input.form-control.countrycode-left")).sendKeys("8754645405"); // CSS 
     
     driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8754645405"); // X path
	  
	  */
	 
	 // Sign up button
	 
	 driver.findElement(By.id("signup-btn")).click();
	 
	/* driver.findElement(By.className("form-control")).click(); // Class name
	 
	 driver.findElement(By.tagName("input")).click();   // tag name
	 
	 driver.findElement(By.cssSelector("input#mobileNumber")).click();  // CSS selector

	 driver.findElement(By.xpath("//input[@id='mobileNumber']")).click();   // X Path
     
     */

	driver.close(); 

	}

}
