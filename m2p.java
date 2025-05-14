package selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class m2p {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		driver.findElement(By.cssSelector("#gender-male")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("PUNIT");
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("KUMAR");
		
		driver.findElement(By.xpath("(//input[@id='Email'])[1]")).sendKeys("punitkumar33@gmail.com"); //after running once ,increment the number to run again.
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("punit23");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("punit23");
		
		driver.findElement(By.cssSelector("#register-button")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
		
		Thread.sleep(2000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	       js.executeScript("window.scroll(0,700);");
	       
	     driver.findElement(By.cssSelector("img[title='Show details for Build your own expensive computer']")).click();
	     
	     JavascriptExecutor js2 = (JavascriptExecutor) driver;
	     
	     js2.executeScript("window.scroll(0,500);");
	     
	     
	     driver.findElement(By.xpath("//input[@id='add-to-cart-button-74']")).click();
	     
	     Thread.sleep(2000);
	     

        WebElement addcart = driver.findElement(By.cssSelector("[class='content']"));
        
        System.out.print(addcart);
        
        assertEquals("The product has been added to your ", addcart.getText());
	       
	       
	}

}
