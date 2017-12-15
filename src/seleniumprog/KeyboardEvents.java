package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.icicibank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.id("Search"));
		Actions myaction = new Actions(driver);
		
		myaction.keyDown(search, Keys.SHIFT).sendKeys("credit").keyUp(search, Keys.SHIFT).perform();
		myaction.sendKeys("card").perform();

	}

}
