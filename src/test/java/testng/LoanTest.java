package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoanTest {

	@BeforeTest(alwaysRun=true)
	public void method3()
	{
		System.out.println("inside before test");
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void method1()
	{
		System.out.println("inside method1");
	}
	
	
	@Test(groups = {"Sanity"} , priority=0, description="this test is for Home loan" )
	public void HomeLoanTest() 
	{
		System.out.println("inside homeloan test");
	}
	
	@Test(enabled=true , priority=1, description="this test is for car loan")
	public void CarLoanTest() 
	{
		System.out.println("inside carloan test");
	}
	

	@AfterMethod(alwaysRun=true)
	public void method2()
	{
		System.out.println("inside method2");
	}
	
	
	@AfterTest(alwaysRun=true)
	public void method4()
	{
		System.out.println("inside after test");
	}
	
	
}