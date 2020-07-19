package TestNG_Practices;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNG_1 {
	public WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void SetUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		}
	}
	
	
	@Test
	@Parameters({"browser","userName","passWord"})
	public void FirstTest(String Browser,String userName,String passWord) throws Exception
	{
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);
		driver.findElement(By.id("loginbutton")).click();
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[text()='Account Settings']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	}
	
	@AfterTest(enabled=false)
	public void CloseUp() 
	{
	driver.quit();
	}

}
