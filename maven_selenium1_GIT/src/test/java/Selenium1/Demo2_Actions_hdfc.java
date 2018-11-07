package Selenium1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2_Actions_hdfc {
	WebDriver driver = null;

	@Test
	public void Login() throws IOException, InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.07\\Desktop\\selenium driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
	driver.get("https://www.hdfcbank.com");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Actions act1= new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	Thread.sleep(2000);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
	Thread.sleep(2000);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().build().perform();
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	Assert.assertTrue(driver.getTitle().startsWith("Demat"));
	Thread.sleep(2000);
	driver.close();
	
	}	
}
