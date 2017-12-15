package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		//create an object for webdriver interface
				WebDriver driver = new FirefoxDriver();
				//Navigate to URL
				driver.get("http://www.google.com");
				//Maximize window
				driver.manage().window().maximize();
				//sync the window
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//validate title
				String expectedTitle = "Google";
				String actualTitle = driver.getTitle();
				if(expectedTitle.equals(actualTitle))
				{
					System.out.println("Title is correct");
				}
				else
				{
					System.out.println("Title verification failed");
				}
				driver.findElement(By.id("lst-ib")).sendKeys("selenium");
				
				WebElement searchbutton = driver.findElement(By.name("btnK"));
				searchbutton.click();
				System.out.println(driver.getTitle());
				driver.close();
				System.out.println("test completed successfully");
				

	}

}
