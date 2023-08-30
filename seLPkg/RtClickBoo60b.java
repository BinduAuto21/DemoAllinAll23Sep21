package seLPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RtClickBoo60b {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		
		
		WebElement rightClickBtn = driver.findElement(By.cssSelector(".context-menu-one"));
		
		action.contextClick(rightClickBtn).build().perform();
		
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		
		String txt = copy.getText();
		
		System.out.println(txt);
		
		copy.click();
		
		driver.quit();
		

	}

}
