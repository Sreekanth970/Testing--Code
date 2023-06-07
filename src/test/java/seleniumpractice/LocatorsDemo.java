package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize(); // maximize browser window
		

		Thread.sleep(5000);  //wait on time
		
		
		//Click on login button
        
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
	//3) Provide username  - Admin
         //WebElement txtUsername=driver.findElement(By.name("sssreekanth@gmail.com"));
		 //txtUsername.sendKeys("Admin");
		 driver.findElement(By.name("Email")).sendKeys("sssreekanth@gmail.com");
		
		//4) Provide password  - admin123
		driver.findElement(By.name("Password")).sendKeys("sree@970");
         
		//Click on login button
        
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		//search box
	
		driver.findElement(By.id("small-searchterms")).sendKeys("Computing and Internet");
		
		//search button
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		
		//add the cart
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
	   // driver.findElement(By.linkText( "Computing and Internet"));

		
		
	}
	

}
