import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTestcase {

	
	@Before 
	public void openApplicationTest()
	{
		System.out.println("Application opening");
		
	}
	
	@Test 
	public void RegisterTest()
	{
		System.out.println("This is reister pgm");
		
	}
	
	@After 
	public void logoutTest()
	{
		System.out.println("logout the aoolication");
		
	}
}
