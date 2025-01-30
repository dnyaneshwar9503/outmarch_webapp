package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); // base
		WebDriver driver = new ChromeDriver(); // base
		driver.get("https://happyheels.dev.app.outmarch.io/#/login"); //properties
		driver.findElement(By.id("Username")).sendKeys("outmarch.admin"); //locators -- properties
		driver.findElement(By.id("Password")).sendKeys("Outmarch@2525");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	}

}
