package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
/*get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethodsDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();	
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 
		System.out.println("its print title of page"+   driver.getTitle()); 
		
	     System.out.println("current URL"+ driver.getCurrentUrl()); 
	     
	    //System.out.println("page source....." + driver.getPageSource()); 
//	    String ps=driver.getPageSource();
//	    System.out.println( ps.contains("html"));  
	    //System.out.println(ps);
	     
	    //System.out.println(driver.getWindowHandle()); 
	    
	    //Thread.sleep(4000);
	    //driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	    //Set<String>windowids= driver.getWindowHandles();
	    
	    //for(String winid:windowids)
		//{
			//System.out.println(winid);  
		//}
	    
	}

}
