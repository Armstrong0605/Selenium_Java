package task12;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signupandlogin {
    
    public static void main(String[] args) {
        
        // Set the path for the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        
        // Navigate to the registration page
        driver.get("https://www.guvi.in/register");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        // Fill in the registration form
        driver.findElement(By.id("name")).sendKeys("John Doe"); 
        driver.findElement(By.id("email")).sendKeys("test@gmail.com"); 
        driver.findElement(By.id("password")).sendKeys("123456&*JA");  
        driver.findElement(By.id("mobileNumber")).sendKeys("8754645405");
        
        // Click the signup button
        driver.findElement(By.id("signup-btn")).click();
        
        // Wait for some time to ensure the registration is processed
        try {
            Thread.sleep(5000); // You can adjust the wait time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Locate and click the login button on the top right corner
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Login')]"));
        loginButton.click();
        
        // Fill in the login form
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456&*JA");
        
        // Click the login button
         driver.findElement(By.id("login-btn")).click();
         
       boolean isLoggedIn = false;
        try {
            WebElement userProfile = driver.findElement(By.xpath("//a[contains(text(), 'Profile')]"));
            if (userProfile.isDisplayed()) {
                isLoggedIn = true;
            }
        } catch (Exception e) {
            isLoggedIn = false;
        }
        
        if (isLoggedIn) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Login failed.");
        } 
        
        // Close the browser
        driver.quit();
    }
}
