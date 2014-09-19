package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.opera.core.systems.OperaDriver;

public class AllBrowsers {
	public WebDriver driver;
	public void googleChrome(){
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");		
	}
	public void ie(){
System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
driver=new InternetExplorerDriver();
driver.get("http://spicejet.com");
	}
	public void safari(){
		driver=new SafariDriver();
		driver.get("http://spicejet.com");
	}
	public void opera(){
		driver=new OperaDriver(); 
		driver.get("http://spicejet.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllBrowsers a=new AllBrowsers();
		//a.googleChrome();
		//a.ie();
		a.safari();
	}

}
