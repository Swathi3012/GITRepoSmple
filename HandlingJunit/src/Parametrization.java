import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Parametrization {

String username;
String password; // declaring local variable in the global variable

public Parametrization(String user, String pass) // using the constructor

{
	username = user; // declaring in local variable
	password = pass;
}

@Test

public void LoginTest()
{
	System.out.println(username + "----" + password);
}

@Parameters
//storing the credentials in the parameters
public static Collection<String[]> getData() // this is not void as it is collection of string array 

/*Here we are using collection of string array is to fetch the data set.
 * Ex: in the above it will fetch zeroth array first and then 1st array.
 * It will not fetch single row
 */

{
	String[][] data = new String [3][2];
	data[0][0]="user001";
	data[0][1]="pass001";
	data[1][0]="user002";
	data[1][1]="pass002";
	data[2][0]="user003";
	data[2][1]="pass003";
	return Arrays.asList(data); // there is a method is array called asList which converts sting array in a list
	
	
}

}
