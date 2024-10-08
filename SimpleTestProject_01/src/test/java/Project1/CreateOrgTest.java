package Project1;

import org.testng.annotations.Test;

public class CreateOrgTest {
	
	
	@Test
	public void createOrg() {
		
	      String Url=  System.getProperty("url");
	      String Browser=  System.getProperty("browser");
	      String UserName=  System.getProperty("username");
	      String Password=  System.getProperty("password");

			System.out.println(Url);
			System.out.println(Browser);	
			System.out.println(UserName);
			System.out.println(Password);

			
			System.out.println("create org name");
			System.out.println("org Name ");
			System.out.println("org number");

		}
	@Test
		public void modifyOrg() {
			System.out.println("modify the Org ");
		}

}
