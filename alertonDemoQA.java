package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  js.executeScript("window.scroll(0,600);");
		 
		 driver.findElement(By.cssSelector("[id='alertButton']")).click();
		 
		 driver.switchTo().alert().accept();
		 
		 WebElement altert2= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		 
		 altert2.click();
		 
		 Thread.sleep(5000);
		 
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 
		  //wait.until(ExpectedConditions.invisibilityOf(altert2));
		  
		
		 
		  
		  driver.switchTo().alert().accept();
		  
		 
		  
		  driver.findElement(By.xpath("(//li[@id='item-2'])[2]")).click();
		  
		  WebElement iframe1 = driver.findElement(By.id("frame1"));
		  
		  driver.switchTo().frame(iframe1);
		  
          driver.navigate().back();
          
		  driver.findElement(By.xpath("(//li[@id='item-2'])[2]")).click();
		  
          JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  
		  js1.executeScript("window.scroll(0,600);");
		  
		  WebElement iframe2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		  
		  driver.switchTo().frame(iframe2);
		  
		  JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  
		  js2.executeScript("window.scroll(0,50);");

	}

}
