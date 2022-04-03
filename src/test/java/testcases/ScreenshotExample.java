package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class ScreenshotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			
			
			    WebDriver driver = new ChromeDriver();

			 
		        driver.get("https://demoqa.com/alerts");
		        
		        driver.manage().window().maximize();
		        
		        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		      
		        

		        TakesScreenshot obj = (TakesScreenshot) driver;
		        
			       File file = obj.getScreenshotAs(OutputType.FILE);
		       
					try {
						FileUtils.copyFile(file, new File("image.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
	}

}
