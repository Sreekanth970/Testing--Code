package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorsDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();


		//css with tag & id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("14.1-inch Laptop");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("14.1-inch Laptop");

		//tag class
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("14.1-inch Laptop");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("14.1-inch Laptop");
		
		//tag & attribute
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("14.1-inch Laptop");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("14.1-inch Laptop");
		
		//tag class & attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("14.1-inch Laptop");
	
	}
}
