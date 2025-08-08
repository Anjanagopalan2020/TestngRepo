package qa.com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@Test
	public void test()
	{
		System.out.println("This is test method(test)");
	}
	@Test
	public void test1()
	{
		System.out.println("This is test1 method(test1)");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is before test method(before method)");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is after test method(aftermethod)");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before the first @test method(beforeclass)");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after all@test  method(afterclass)");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is before the first @test method(before test)");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is after all @ test method in all the classes(aftertest)");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is before the first test method(beforesuite)");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("This is after all the  test methods(aftersuite)");
	}
	
	

}
