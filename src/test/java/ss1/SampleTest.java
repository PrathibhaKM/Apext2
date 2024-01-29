package ss1;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups={"smoke","regression"})
	public void sample1Test()
	{
		System.out.println("--Testscript--1");
	}
	@Test
	public void sample2Test()
	{
		System.out.println("--Testscript--2");
	}
	
}
