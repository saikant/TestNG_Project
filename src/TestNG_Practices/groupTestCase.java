package TestNG_Practices;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class groupTestCase {
	
	public WebDriver driver;
	
	@Test(groups={"smoke"})
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups={"sanity"})
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@Test(groups= {"smoke"})
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@Test(groups= {"smoke"})
	public void Test5()
	{
		System.out.println("Test5");
	}
}