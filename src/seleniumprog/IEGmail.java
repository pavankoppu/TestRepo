package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEGmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\subject\\selenium\\IEDriverServer_Win32_2.46.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
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
		
	}

}
