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

public class GmailLogin_Logout {
	
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("Email")).sendKeys("swethagampa11");
		driver.findElement(By.id("Passwd")).sendKeys("Swetha13");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(4000);
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  System.setProperty("webdriver.ie.driver", "E:\\Lib\\IEDriverServer.exe");
	  DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//driver=new FirefoxDriver();
		driver.get("http://gmail.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

	




