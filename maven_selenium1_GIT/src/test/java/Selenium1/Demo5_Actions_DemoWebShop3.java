package Selenium1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo5_Actions_DemoWebShop3 {
	WebDriver driver = null;

	@Test
	public void Login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_b6b.00.07\\Desktop\\selenium driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Upload=driver.findElement(By.id("uploadfile_0"));
		Upload.sendKeys("C:\\Users\\training_b6b.00.07\\Desktop\\sin\\screenshot.png");  
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		Thread.sleep(5000);
		
				
		driver.close();
		
		
	}
}