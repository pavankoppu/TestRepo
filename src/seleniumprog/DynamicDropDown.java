package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement source = driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
		source.click();
		driver.findElement(By.xpath("//a[contains(text(),'Goa')]")).click();
		

	}

}
