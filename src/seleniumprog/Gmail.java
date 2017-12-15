package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		
		//create an object for webdriver interface
		WebDriver driver = new FirefoxDriver();
		//Navigate to URL
		driver.get("http://www.gmail.com");
		//Maximize window
		driver.manage().window().maximize();
		//sync the window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("Email")).sendKeys("testuser@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.name("Passwd")).sendKeys("1234");
		driver.findElement(By.id("signIn")).click();
		
		
		
		driver.close();

	}

}
