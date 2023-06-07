package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommandsDemo {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//  isDisplayed()  isEnabled()
		//WebElement logo=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img"));
		//System.out.println("displsy status of logo:"+logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).isDisplayed();
		//System.out.println(status);
		
//		WebElement searchbox=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]"));
//		System.out.println("Dispay status:"+searchbox.isDisplayed());
//		System.out.println("Enable status:"+searchbox.isEnabled());
		
		//isSelected()
		
		WebElement Excellent_rd=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[1]/input"));
		WebElement Good_rd=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[2]/input"));
		
		//Before selection
		System.out.println("Before selection...............");
		System.out.println(Excellent_rd.isSelected()); //false
		System.out.println(Good_rd.isSelected()); //false
		
		//After selection of Good radio button
		System.out.println("After selection of good radiop button............");
		Good_rd.click();
		System.out.println(Excellent_rd.isSelected()); //true
		System.out.println(Good_rd.isSelected()); //false
				
		
		//After selection of Excellent radio button
		System.out.println("After selection of Excellent radiop button............");
		Excellent_rd.click();
		System.out.println(Excellent_rd.isSelected()); //false
		System.out.println(Good_rd.isSelected()); //true
						
	}

}


	
