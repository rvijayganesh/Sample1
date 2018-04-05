package vijay;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	@BeforeTest
	public void login()
	{
		
		System.out.println("inside login");
	}
	
	@AfterTest
	public void logout()
	{
		System.out.println("inside logout");
	}
	
	public void install1()
	{
		System.out.println("install 1");
	}
	public void install2()
	{
		System.out.println("install 2");
	}
	public void install3()
	{
		System.out.println("install 3");
	}
	
	

}
