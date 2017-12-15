package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		  driver.get("http://www.google.com");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  String ExpectedTitle = "google";
		  String ActualTitle = driver.getTitle(); //Google
		  Assert.assertEquals(ActualTitle, ExpectedTitle, "title verification not successful");
		  System.out.println("Completed Test execution");

	}

}
