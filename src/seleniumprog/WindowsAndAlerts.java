package seleniumprog;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsAndAlerts {

	public static void main(String[] args) {
	
		
		 WebDriver driver = new FirefoxDriver();
		  driver.get("http://www.hdfcbank.com");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.id("loginsubmit")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Set<String> HDFCWins = driver.getWindowHandles();
		  for(String Handle : HDFCWins)
		  {
			  driver.switchTo().window(Handle);
			  if(driver.getTitle().equals("NetBanking"))
			  {
				  driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.switchTo().frame("login_page");
			//  driver.findElement(By.name("fldLoginUserId")).sendKeys("51984465");
			  driver.findElement(By.xpath("//img[contains(@alt,'continue')]")).click();
			  
			  //Handling alert
			  
			  Alert hdfcalert = driver.switchTo().alert();
			  System.out.println(hdfcalert.getText());
			  hdfcalert.accept();
			  
			  
			  }
			  }
		

	}

}
