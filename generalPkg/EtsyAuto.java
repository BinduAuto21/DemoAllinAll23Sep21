package generalPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyAuto {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");
		driver.findElement(By.xpath("//button[contains(@class,'signin')]")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		driver.switchTo().window("7k7za0aNrPCM2AbGRjjI1c3c");
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bkarnam74@gmail.com");
		
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@id='join_neu_password_field']")).sendKeys("Mango@23");
		
		driver.findElement(By.xpath("//button[contains(@class,'primary')and@type='submit']")).click();
		
		

	}

}
