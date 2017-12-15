package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.icicibank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement prod = driver.findElement(By.linkText("Products"));
		Actions myaction = new Actions(driver);
		myaction.moveToElement(prod).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement homeloan = driver.findElement(By.linkText("Home Loan"));
		myaction.moveToElement(homeloan).click().perform();
		
		System.out.println(driver.getTitle());
		
	}

}
