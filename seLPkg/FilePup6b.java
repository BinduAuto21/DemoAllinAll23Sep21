package seLPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePup6b {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://html.com/?s=fileupload+popup");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("C:\\Users\\bkarn\\OneDrive\\Desktop\\fupTest\\Fpup.txt");
		Thread.sleep(2000);
		
		
		driver.close();

	}

}