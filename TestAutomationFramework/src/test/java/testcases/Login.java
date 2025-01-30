package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseTest {
	
	@Test
	public static void LoginTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); // base
		WebDriver driver = new ChromeDriver(); // base
		driver.get("https://happyheels.dev.app.outmarch.io/#/login"); //properties
		Thread.sleep(2000);
		/*driver.findElement(By.id(loc.getProperty("username_field"))).sendKeys("outmarch.admin");
		driver.findElement(By.id(loc.getProperty("password_field"))).sendKeys("Outmarch@2525");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
		*/
		driver.findElement(By.id("Username")).sendKeys("outmarch.admin");
		//driver.findElement(By.id("Username")).sendKeys("outmarch.admin"); //locators -- properties
		//driver.findElement(By.id(loc.getProperty("username"))).sendKeys("outmarch.admin");
		driver.findElement(By.id("Password")).sendKeys("Outmarch@2525");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
		
	}
	
}
