import org.junit.Test;

import junit.framework.Assert;

public class HandlingAsserts {

	@Test
	
	public void LoginTest()

	{
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click login button");
		
		String expectedData="logout";
		String actualData="login"; // here the assert will fail as the expected result is not equal to the actual result
		
		Assert.assertEquals(expectedData, actualData);
	
		System.out.println("success"); // this will not execute as the assert fails
	}
	
	
	@Test
	
	public void Register()
	{
		try {
			System.out.println("enter username");
			System.out.println("enter password");
			System.out.println("click submit button");
			
			String expectedData="welcome";
			String actualData="login"; // here the assert will fail as the expected result is not equal to the actual result
			Assert.assertEquals(expectedData, actualData);
			
		} catch(Throwable t){
			System.out.println("proceeding further");
			
		}
	}
}
