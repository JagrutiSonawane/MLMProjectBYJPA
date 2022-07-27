package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeyword {
	public static RemoteWebDriver driver;
	public static void openBrowser(String browserName) { 
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		System.out.println(browserName+" is launched");
	}
	
	public static void launchUrl(String url) 
	{
		driver.get(url);
		System.out.println("Url launched :"+url);
	}
	
	public static void closeBrowser() 
	{
		driver.close();
		System.out.println("Browser closed");
	}
   public static void click(String b) {
	   driver.findElement(By.xpath(b)).click();
   }
   public static String getUrl() {
	   String s=driver.getCurrentUrl();
	   return s;
}
}

