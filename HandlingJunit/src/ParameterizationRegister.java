import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizationRegister {
	
	String username;
	String password;
	String DOB;
	String studylevel;
	String studydestination;
	
	public ParameterizationRegister(String user, String pass, String birth, String qualification, String country) {
		
		username=user;
		password=pass;
		DOB=birth;
		studylevel=qualification;
		studydestination=country;
		
	}

	
	@Test
	public void RegiterTest() {
		
	}
}
