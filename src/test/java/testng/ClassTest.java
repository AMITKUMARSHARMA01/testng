package testng;

import org.testng.annotations.Test;

public class ClassTest {

	@Test(groups= {"Sanity"})
	public void CreditCardTest()
	{
		System.out.println("inside cc test");
	}

}
