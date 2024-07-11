package task9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
    
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();    
        
        driver.get("https://www.snapdeal.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));    
        
        // Locate the login element correctly
        driver.findElement(By.xpath("//span[contains(@class, 'accountUserName col-xs-12 reset-padding')]")).click();
        
        // Locate the continue button correctly
        driver.findElement(By.xpath("//span[contains(@class, 'accountBtn btn rippleWhite')]")).click();
        
        // Switch to the login frame
        driver.switchTo().frame("iframeLogin");
        
        // Input the username correctly
        driver.findElement(By.id("userName")).sendKeys("8754645405");
        
        // Click on the check user button
        driver.findElement(By.id("checkUser")).click();
        
        Thread.sleep(15000);
        
        // Click on the login using OTP button
        driver.findElement(By.id("loginUsingOtp")).click();
        
        try {
            // Wait for an element that indicates a successful login
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            boolean isLoggedIn = driver.findElement(By.xpath("//span[contains(@class,'accountUserName col-xs-12 reset-padding')]")).isDisplayed();
            
            if (isLoggedIn) {
                System.out.println("Login successful! Verification message: User logged in.");
            }
        } catch (Exception e) {
            System.out.println("Login failed or verification element not found.");
        }
        
        // Add necessary cleanup actions
       // driver.quit();
    }
}
