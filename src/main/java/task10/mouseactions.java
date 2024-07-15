package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Switch to the iframe that contains the draggable and droppable elements
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        
        // Locate the source element
        WebElement source = driver.findElement(By.id("draggable"));

        // Locate the destination element
        WebElement destination = driver.findElement(By.id("droppable"));
        
        // Perform drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).perform();
        
        String actualText = destination.getText();
        if (actualText.equals("Dropped!")) {
            System.out.println("Text verification passed. The text of the target element is: " + actualText);
        } else {
            System.out.println("Text verification failed. The text of the target element is: " + actualText);
        }
        
        String expectedColor = "#fffa90"; // Adjust based on expected color after drop
        
        String actualColor = destination.getCssValue("background-color");
        
        if (actualColor.equals(expectedColor)) {
        	
            System.out.println("The color of the target element is: " + actualColor);
            
        } 
        else 
        {
            System.out.println("The color of the target element is: " + actualColor);
        }
        
        
        // Close the browser
       driver.quit();
    }
}
