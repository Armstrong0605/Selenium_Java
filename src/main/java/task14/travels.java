package task14;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class travels {
    
    public static void main(String[] args) throws IOException {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://phptravels.com/demo/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector(".first_name")).sendKeys("User");
        driver.findElement(By.cssSelector(".last_name")).sendKeys("Test");
        driver.findElement(By.cssSelector(".whatsapp_number.form-control")).sendKeys("7895641235");
        driver.findElement(By.cssSelector(".company_name.form-control")).sendKeys("ABC Company");
        driver.findElement(By.cssSelector(".email.form-control")).sendKeys("abc@gmail.com");
        
        WebElement a = driver.findElement(By.id("numb1"));
        WebElement b = driver.findElement(By.id("numb2"));
       
        String textA = a.getText();
        String textB = b.getText();
        
        int numb1 = Integer.parseInt(textA);
        int numb2 = Integer.parseInt(textB);
        
        int sum = numb1 + numb2;
        
        driver.findElement(By.id("number")).sendKeys(String.valueOf(sum));
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        
        File directory = new File("C:\\Users\\Jenner\\eclipse-workspace\\Screenshots");
        
        File destinationFile = new File(directory, "screenshot.png");
       
        FileHandler.copy(sourceFile, destinationFile);
        
        System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
       
        driver.quit();
    }
}

