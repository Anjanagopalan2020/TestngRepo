package qa.com.testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test (groups= {"smoketest","regression"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups={"smoketest1"})
	public void test2()
	{
		System.out.println("test2");
	}

	@Test(groups={"smoketest"})
	public void test3()
	{
		System.out.println("test3");
	}

	@Test(groups={"smoketest"})
	public void test4()
	{
		System.out.println("test4");
	}
	
	@Test(groups= {"smoketest","regression"})
	public void test5()
	{
		System.out.println("test5");
	}



}
