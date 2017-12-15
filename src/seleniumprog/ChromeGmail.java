package seleniumprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
