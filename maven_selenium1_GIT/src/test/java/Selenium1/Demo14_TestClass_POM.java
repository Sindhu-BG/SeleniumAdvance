package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Selenium.Demo15_Listeners.class)

public class Demo14_TestClass_POM {
	WebDriver driver;

	@Test
	public void demowebshop() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_b6b.00.07\\Desktop\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Demo13_PageClass pobject=new Demo13_PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		pobject.clicklink();
		pobject.typeusername();
		pobject.typepassword();
		pobject.clicklogin();
		pobject.clickonsignup();
		pobject.clickonsubscribe();
		pobject.clickonlogout();
		
		System.out.println("Title of the page is"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().startsWith("Demo"));
	}

		}

