package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		
		
		    WebDriver driver = new ChromeDriver();

		 
	        driver.get("https://www.facebook.com/");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      
	        WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	        
	        WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	        
	        WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	        
	        //WebElement UserName =  driver.findElement(By.cssSelector("input#email"));
	        
	        WebElement Text = driver.findElement(By.xpath("//h2[contains(text(),'share with the people')]"));
	        
	        UserName.sendKeys("abcxyz");
	        Password.sendKeys("pqrstu");
	      
	        LoginBtn.click();
	        
	        //driver.close();

	}

}
