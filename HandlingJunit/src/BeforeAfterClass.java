import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterClass {

	@BeforeClass 
	public static void openApplicationTest()
	{
		System.out.println("Application opening");
		
	}
	
	@Test 
	public void RegisterTest()
	{
		System.out.println("This is reister pgm");
		
	}
	
	@Test 
	public void LoginTest()
	{
		System.out.println("This is login pgm");
		
	}
	
	@Test 
	public void LogoutTest()
	{
		System.out.println("This is logout pgm");
		
	}
	
	@AfterClass 
	public static void closeApplicationTest()
	{
		System.out.println("close the aoolication");
		
	}
}
