package seLPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe7 {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.get("https://www.freecrm.com/index.html");
		
		driver.get("https://ui.freecrm.com/");
		
		
		

	}

}
