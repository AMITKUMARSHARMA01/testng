package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollExample {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		
		
		    WebDriver driver = new ChromeDriver();

		 
	        driver.get("https://www.w3schools.com/html/html_tables.asp");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      

	        WebElement SrollTo = driver.findElement(By.xpath("//h2[text()='Table Rows']"));
	        
	        JavascriptExecutor jsObj = (JavascriptExecutor) driver;
	        jsObj.executeScript("arguments[0].scrollIntoView()", SrollTo);

	}

}
