package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxesRadioButtons {
	
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		WebElement student = driver.findElement(By.name("ctl00$mainContent$chk_StudentDiscount"));
		System.out.println(student.isSelected());
		student.click();		
		System.out.println(student.isSelected());
		
		
	}

}
