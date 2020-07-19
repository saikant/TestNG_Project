package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("34343");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
//        driver.close();
        
	}

}
