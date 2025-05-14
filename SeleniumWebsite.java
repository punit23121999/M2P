package selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebsite {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.selenium.dev/");

        String expectitle = "Selenium";
         driver.getTitle();

        System.out.println(driver.getTitle());

        
        assertEquals(driver.getTitle(), expectitle);

        driver.quit();
    }
}

