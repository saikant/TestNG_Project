package BasicPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TC {

	public static void main(String[] args) throws AWTException, Throwable {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("saikant@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");

        driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		driver.close();
	
	}

}
