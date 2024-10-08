package Project2;

import org.testng.annotations.Test;

public class CreateContactTest {


	@Test
	public void createContact() {
		
      String Url=  System.getProperty("url");
      String Browser=  System.getProperty("browser");
      String UserName=  System.getProperty("username");
      String Password=  System.getProperty("password");

		System.out.println(Url);
		System.out.println(Browser);	
		System.out.println(UserName);
		System.out.println(Password);

		
		System.out.println("Contact name");
		System.out.println("Contact Last Name ");
		System.out.println("contact number");

	}
	@Test
	public void modifyContact() {
		System.out.println("modify the Contact ");
	}

}
