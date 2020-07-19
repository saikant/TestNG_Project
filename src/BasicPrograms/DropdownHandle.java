package BasicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	WebElement ele1=driver.findElement(By.id("select-demo"));
	Select sel=new Select(ele1);
	sel.selectByVisibleText("Monday");
	Thread.sleep(2000);
	sel.selectByValue("Tuesday");
	sel.selectByIndex(1);
	Thread.sleep(1000);
	
	Select sele1=new Select(driver.findElement(By.id("multi-select")));
	for(int i=0;i<8;i++)
	{
	sele1.selectByIndex(i);
	}
	WebElement optionName=sele1.getFirstSelectedOption();
    System.out.println(optionName.getText());
	Thread.sleep(1000);
	System.out.println("---------------------------------");
	List<WebElement> allOptions=sele1.getOptions();
	for(WebElement options:allOptions)
	{
		System.out.println(options.getText());
	}
	
//	sele1.deselectAll();
	sele1.deselectByIndex(4);
	sele1.deselectByIndex(2);
	Thread.sleep(1000);
	sele1.deselectByValue("New York");
	Thread.sleep(1000);
	sele1.deselectByVisibleText("Texas");
	Thread.sleep(1000);
	System.out.println("---------------------------------");
	List<WebElement> allOptions1=sele1.getAllSelectedOptions();
	for(WebElement options1:allOptions1)
	{
		System.out.println(options1.getText());
	}
	driver.close();
	}

}
