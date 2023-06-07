package seleniumpractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownwithSelectTagDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		//WebElement drpCountryEle=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[2]/div[1]/select[1]"));
		//Select drpCountry=new Select(drpCountryEle);
		
		//1) Selecting an option from teh dropdown
		//drpCountry.selectByVisibleText("USA");
		 //drpCountry.selectByValue("4"); // use this only if value attribute is present for option tag
		//drpCountry.selectByIndex(3); //France
		
		// 2) Find total options in dropdown
		//List<WebElement> options=drpCountry.getOptions();
		//System.out.println("total number of options:"+options.size());
		
		//3) print options in console window
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		//using enhanced loop
		//for(WebElement op:options)
		//{
			//System.out.println(op.getText());
	}

}
