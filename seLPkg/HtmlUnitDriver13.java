package seLPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver13 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.zoho.com/");
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id='namefield']")).sendKeys("Yadamma Karnam");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Yadamma23@hotmail.com");
//		
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mango@123");
//		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9085916360");
//		
//		driver.findElement(By.xpath("//span[@id='signup-termservice']")).click();
//		driver.findElement(By.xpath("//input[@id='signupbtn']")).click();
//		
//		
	}

}
