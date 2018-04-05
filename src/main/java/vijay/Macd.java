package vijay;

import org.testng.annotations.Test;

public class Macd extends TestBase {
	Install objinstall = new Install();
	
	@Test
	public void macd_prod1()
	{
		System.out.println("inside Macd prod 1 ");
		objinstall.prod1();
	}
	
	@Test
	public void macd_prod2()
	{
		System.out.println("inside Macd prod 2 ");
	}
	
	@Test
	public void macd_prod3()
	{
		System.out.println("inside Macd prod 3 ");
	}

}
