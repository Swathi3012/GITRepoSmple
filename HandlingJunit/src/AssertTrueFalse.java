import org.junit.Test;

import junit.framework.Assert;

public class AssertTrueFalse {
	
	@Test
	
	public void TrueTest() {
		Assert.assertTrue(2<4);
		
		/*In the above 2<4 is rue, hence the testcase will pass
		 * If we give condn as 5<4, the test case will fail as the condition is falls
		 */
	}
	
	@Test
	
	public void FalseTest() {
		Assert.assertFalse(9<4);
		
		/*In the above 9<4 is false, hence the testcase will pass
		 * If we give condn as 2<4, the test case will fail as the condition is true
		 */
	}

	

}
