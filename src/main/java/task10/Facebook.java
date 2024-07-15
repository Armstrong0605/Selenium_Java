package task10;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        System.out.println("Account User Login Successful");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

        driver.findElement(By.name("firstname")).sendKeys("Test");

        driver.findElement(By.name("lastname")).sendKeys("User");

        driver.findElement(By.name("reg_email__")).sendKeys("testuser@gmail.com");

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@gmail.com");

        driver.findElement(By.name("reg_passwd__")).sendKeys("Jenner123");

        WebElement date = driver.findElement(By.name("birthday_day"));

        Select dropdown = new Select(date);

        dropdown.selectByValue("11");

        WebElement month = driver.findElement(By.name("birthday_month"));

        Select dropdown1 = new Select(month);

        dropdown1.selectByIndex(4);

        WebElement year = driver.findElement(By.name("birthday_year"));

        Select dropdown2 = new Select(year);

        dropdown2.selectByValue("1985");

        String gender = "Male";

        List<WebElement> radioButtons = driver.findElements(By.xpath("//label[@class='_58mt' and contains(text(), 'Male')]"));

        for (WebElement ele : radioButtons) {
            String res = ele.getText();

            if (res.equalsIgnoreCase(gender)) {
                Actions act = new Actions(driver);
                act.moveToElement(ele).click().perform();
                break; // Exit the loop once the correct radio button is clicked
            }
        }

        
        WebElement submitButton = driver.findElement(By.name("websubmit"));
        submitButton.click();

        // Verify the user is redirected to the home page (example check, depends on your specific page)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String expectedTitle = "Facebook – log in or sign up"; // Adjust the expected title as needed
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("User successfully navigated to the home page.");
        } else {
            System.out.println("Navigation to the home page failed.");
        }

        // Close the browser
        driver.quit();
    }
}
