package seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//Capture full page screenshot - 
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
	    // File src=ts.getScreenshotAs(OutputType.FILE);
		//File trg=new File("C:\\Users\\sreekanth.s\\eclipse-workspace\\seleniumproject1\\src\\test\\java\\seleniumpractice\\Screen Shots\\Fullpage.png");
		 // FileUtils.copyFile(src, trg);
		 
		
		
		// capture screenshot of specific web element -- selenium 4+
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img"));
		
				File src=logo.getScreenshotAs(OutputType.FILE);
				File trg=new File("C:\\Users\\sreekanth.s\\eclipse-workspace\\seleniumproject1\\src\\test\\java\\seleniumpractice\\Screen Shots\\Fullpage.pngfeatureproducts.png");
				FileUtils.copyFile(src, trg);
		
		//WebElement FEATUREDPRODUCTS=driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
		
		//File src=FEATUREDPRODUCTS.getScreenshotAs(OutputType.FILE);
		//File trg=new File("C:\\Users\\sreekanth.s\\eclipse-workspace\\seleniumproject1\\src\\test\\java\\seleniumpractice\\Screen Shots\\page.pngfeatureproducts.png");
		//FileUtils.copyFile(src, trg);
					
	}

}

	
