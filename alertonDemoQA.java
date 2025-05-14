package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertonDemoQA {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.findElement(By.cssSelector("[id='alertButton']")).click();
		 
		 driver.switchTo().alert().accept();
		 
		 WebElement altert2= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		 
		 altert2.click();
		 
		 Thread.sleep(5000);
		 
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 
		  //wait.until(ExpectedConditions.invisibilityOf(altert2));
		  
		
		 
		  
		  driver.switchTo().alert().accept();

	}

}
