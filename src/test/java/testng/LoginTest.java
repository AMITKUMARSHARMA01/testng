package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void Setup() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		 driver = new ChromeDriver();

		 // WebDriver driver =new FirefoxDriver();
		 
	        driver.get("https://www.simplilearn.com/");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	        
	        Thread.sleep(4000);
	}
	
	@Parameters({"param1", "param2"})
	@Test(groups = {"Sanity"})
	public void LoginTestcase1(String UserNameVal , String PasswordVal)
	{
		 WebElement LoginLink =  driver.findElement(By.linkText("Log in"));
	        LoginLink.click();
	        
	        WebElement EmailElement = driver.findElement(By.name("user_login"));
	        EmailElement.sendKeys(UserNameVal);
	        
	        WebElement Password = driver.findElement(By.id("password"));
	        Password.sendKeys(PasswordVal);
	        
	        WebElement RememberMe = driver.findElement(By.className("rememberMe"));
	        RememberMe.click();
	        
	        WebElement LoginBtn = driver.findElement(By.name("btn_login"));
	        LoginBtn.click();
	        
	        WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
	        
	        String ActMsg = ErrorMsg.getText();
	        String ExpMsg = "The email or password you have entered is invalid.";
	        
	       /* if(ActMsg.equals(ExpMsg))
	        {
	        	//System.out.println("test passed");
	        }else {
	        	System.out.println("test failed");
	        }*/
	        
	        Assert.assertEquals(ActMsg ,  ExpMsg);
	        
	        List<WebElement> Links = driver.findElements(By.tagName("a"));
		       
	        System.out.println("total number of links are " + Links.size());
	        
	        for(int i=0; i<Links.size(); i++)
	        {
	        	System.out.println("Href is" + Links.get(i).getAttribute("href"));
	        }
	        		
	}
	
	@AfterMethod(alwaysRun=true)
	public void TearDown()
	{  
	        driver.close();
	}
	
	
}