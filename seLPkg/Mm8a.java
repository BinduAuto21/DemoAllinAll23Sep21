package seLPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mm8a {
    static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*Alert alert=driver.switchTo().alert();
		alert.accept(); */
		//Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/html/body/div[2]/div/div/div[2]")))
		.click().build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("https://corporate.spicejet.com/ExtraSeat.aspx")).click();
		
		
		//*[@id="main-container"]/div/div[2]/html/body/div[2]/div/div/div[2]
				
				

	}

}
