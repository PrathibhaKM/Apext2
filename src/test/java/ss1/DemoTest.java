package ss1;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups="smoke")
	public void Demo1()
	{
		System.out.println("--Testscript--5");
	}
	
	@Test(groups="regression")
	public void Demo2()
	{
		System.out.println("--Testscript- -6");
	}
	

}
