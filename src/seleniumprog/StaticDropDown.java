package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement bmonth = driver.findElement(By.id("month"));
		Select fbday = new Select(bmonth);
		fbday.selectByVisibleText("Dec");
		fbday.selectByValue("6");
		fbday.selectByIndex(1);
		
		
		
		

	}

}
