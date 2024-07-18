package task12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
    
    public static void main (String[] args) {
        
        // Set the path for the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver(); 
        
        // Navigate to the jQuery UI datepicker demo page
        driver.get("https://jqueryui.com/datepicker/");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
        // Open the date picker
        driver.findElement(By.id("datepicker")).click();
        
        // Locate and click the next month button
        WebElement nextMonthButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
        nextMonthButton.click();
        
        // Select the 22nd date in the next month
        WebElement dateSelect = driver.findElement(By.xpath("//a[text()='22']"));
        dateSelect.click();
        
        // Get the selected date from the input field
        String selectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
        
        // Print the selected date in the console
        System.out.println("Selected date: " + selectedDate);
        
        // Close the browser
       // driver.quit();
    }
}