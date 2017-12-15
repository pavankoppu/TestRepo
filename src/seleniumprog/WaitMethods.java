package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//Navigate to URL
		driver.get("http://www.google.com");
		//Maximize window
		driver.manage().window().maximize();
		//sync the window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("webdriver");
		driver.findElement(By.name("btnK")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("webdriver"));
		System.out.println(driver.getTitle());

	}

}
