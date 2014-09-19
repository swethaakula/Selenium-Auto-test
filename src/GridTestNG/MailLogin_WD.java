package GridTestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MailLogin_WD {
	public WebDriver driver;
  @Test
  public void f() {	  
	  driver.findElement(By.id("f_id")).sendKeys("swethagampa11");
		driver.findElement(By.id("f_pwd")).sendKeys("Swetha13");
		driver.findElement(By.cssSelector("input.signin")).click();
  }
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException{
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		//driver=new FirefoxDriver();
		driver.get("http://mail.in.com");
	  
  }
  
  @AfterTest
  public void afterTest(){
	  driver.quit();
  }
}




