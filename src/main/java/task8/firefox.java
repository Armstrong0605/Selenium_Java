package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    
    public static void main (String[] args)
    {
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.google.co.in/");
        
        driver.manage().window().maximize();
        
        // Print the current URL
        String pageURL = driver.getCurrentUrl();
        System.out.println("The current URL is: " + pageURL);
        
        // Reload the page
        driver.navigate().refresh();
        
        // Print the URL after reloading
        String refreshedPageURL = driver.getCurrentUrl();
        System.out.println("The URL after reloading is: " + refreshedPageURL);
        
        // Close the browser
        driver.close();
    }

}
