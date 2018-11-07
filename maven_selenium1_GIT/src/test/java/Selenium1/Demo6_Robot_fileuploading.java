package Selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo6_Robot_fileuploading {
	WebDriver driver = null;

	@Test
	public void Login() throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_b6b.00.07\\Desktop\\selenium driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.inviul.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("s")).sendKeys("Web driver");
		Robot rob = new Robot();
		rob.setAutoDelay(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.keyPress(KeyEvent.VK_4);
		rob.keyRelease(KeyEvent.VK_4);
		System.out.println("Title of the page" + driver.getTitle());
		System.out.println("current URL of the page" + driver.getCurrentUrl());
		Thread.sleep(5000);

		driver.close();

	}
}