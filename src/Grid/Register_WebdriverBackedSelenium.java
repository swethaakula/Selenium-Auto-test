package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Register_WebdriverBackedSelenium {
	
public WebDriver driver;
public Selenium selenium;
	public void openURL() throws MalformedURLException{
		System.setProperty("webdriver.ie.driver", "E:\\Lib\\IEDriverServer.exe");
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		//driver = new FirefoxDriver();
		selenium = new WebDriverBackedSelenium(driver, "http://mail.in.com");
		driver.get("http://mail.in.com");
	}
	public void regster() throws Exception{
		selenium.click("css=input.registernow");
		//driver.findElement(By.cssSelector("input.registernow")).click();
		driver.findElement(By.id("fname")).sendKeys("Nagesh");
//new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
		selenium.select("day", "10");
new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jun");
//new Select(driver.findElement(By.id("year"))).selectByVisibleText("1983");
		selenium.select("year", "1983");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@name='radiousername'])[3]")).click();
Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("nag1234");
		driver.findElement(By.id("repassword")).sendKeys("nag1234");
		driver.findElement(By.id("altemail")).sendKeys("nag@gmail.com");
		driver.findElement(By.id("mobileno")).sendKeys("7894561230");
	//	driver.findElement(By.id("imageField")).click();
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Register_WebdriverBackedSelenium r=new Register_WebdriverBackedSelenium();
r.openURL();
r.regster();
	}

}












