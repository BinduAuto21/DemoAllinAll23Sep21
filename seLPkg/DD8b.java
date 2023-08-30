package seLPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD8b {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    action.clickAndHold(src).moveToElement(target).release().build().perform();
	    
	    
		
		
		

	}

}
