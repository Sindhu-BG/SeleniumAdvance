package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo13_PageClass {
	WebDriver driver;

	By lnc = By.linkText("Log in");
	By uname = By.name("Email");
	By pwd = By.name("Password");
	By login = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By signup=By.id("newsletter-email");
	By subscribe=By.xpath("//*[@id=\"newsletter-subscribe-button\"]");
	By logout=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	public Demo13_PageClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicklink() {
		driver.findElement(lnc).click();
	}
	
	public void typeusername() {
		driver.findElement(uname).sendKeys("sindhu@gmail.com");
	}
	
	public void typepassword() {
		driver.findElement(pwd).sendKeys("sindhu");
	}
	
	public void clicklogin() {
		driver.findElement(login).click();
	}
	
	public void clickonsignup() {
		driver.findElement(signup).sendKeys("sindhu@gmail.com");
	}
	
	public void clickonsubscribe() {
		driver.findElement(subscribe).click();
	}
	
	public void clickonlogout() {
		driver.findElement(logout).click();
	}
}
