package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			
			
			    WebDriver driver = new ChromeDriver();

			 
		        driver.get("https://www.facebook.com/");
		        
		        driver.manage().window().maximize();
		        
		        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		      
		        WebElement NewAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		        NewAccount.click();
		        
		        WebElement DOB = driver.findElement(By.id("day"));
		        WebElement Month = driver.findElement(By.id("month"));
		        WebElement Year = driver.findElement(By.id("year"));
		        
		        Select ddDOB = new Select(DOB);
		        ddDOB.selectByVisibleText("10");
		        
		        Select ddMonth = new Select(Month);
		        ddMonth.selectByVisibleText("Mar");
		        
		        Select ddYear = new Select(Year);
		        ddYear.selectByVisibleText("2022");
		        
		        List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));

		        //WebElement Gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		       // Gender.click();
		        
		        for(int i=0;i<Months.size();i++)
		        {
		        	System.out.println(Months.get(i).getText());
		        }
		        
		        String GenderVal ="Male";
		        
		      //  String GenXpath = "//label[text()='Male']/following-sibling::*";
		        
		        String GenXpath = "//label[text()='" + GenderVal + "']/following-sibling::*";

		        WebElement Gender = driver.findElement(By.xpath(GenXpath));
		        Gender.click();
	}

}
