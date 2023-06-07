package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SleepStatement {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();	
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

}
