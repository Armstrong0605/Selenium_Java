package task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {
    public static void main(String[] args) {
        
        // Launch the Browser
        WebDriver driver = new ChromeDriver();

        // To open Wikipedia Page
        driver.get("https://www.wikipedia.org/");

        // To Maximize the Window
        driver.manage().window().maximize();

        // Navigate to the Artificial Intelligence page
        driver.navigate().to("https://en.wikipedia.org/wiki/Artificial_intelligence");

        // Click on the History section link
        WebElement historyLink = driver.findElement(By.linkText("History"));
        historyLink.click();

        // Print the title of the History section
        WebElement historySection = driver.findElement(By.id("History"));
        System.out.println("The title of the section is: " + historySection.getText());

        // Close the browser
        driver.close();
    }
}
