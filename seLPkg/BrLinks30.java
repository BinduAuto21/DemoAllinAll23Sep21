package seLPkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrLinks30 {
    static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		//1.get the list of all the links and images: 500
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images----> "+linksList.size());
		
		ArrayList<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2.iterate linksList: exclude all the links/images - doesnot have any href attribute
		for(int i=0;i<linksList.size();i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href")!=null) {
				activeLinks.add(linksList.get(i));
				
			}
		}
		//get the size of active links list:
		System.out.println("size of active links and images---> "+activeLinks.size());
		
		//3.check the href url, with httpconnection api:
		//200 --ok
		//404 --not found
		//500 --internal server error
		//400 --bad request
		for(int j=0;j<activeLinks.size();j++) {
			
				HttpURLConnection	connection	=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				connection.disconnect();
				
				String response = null;
				System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
			} 
				
			
		}
		

	}


