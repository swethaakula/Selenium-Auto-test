package GridTestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Register_WebdriverBackedSelenium {
	
	public WebDriver driver;
	public Selenium selenium;
	
  @Test
  public void f() throws InterruptedException {
	  //driver.findElement(By.cssSelector("input.registernow")).click();
		selenium.click("css=input.registernow");
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
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		//driver = new FirefoxDriver();
		selenium = new WebDriverBackedSelenium(driver, "http://mail.in.com");
		driver.get("http://mail.in.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}


