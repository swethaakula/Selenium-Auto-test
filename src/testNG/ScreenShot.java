package testNG;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ScreenShot {
	public WebDriver driver;
public void captureScreenshotWithTimeStamp(String str) throws Exception{
DateFormat d = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
Date dt = new Date();
String time=d.format(dt);
System.out.println(time);
File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File("D:\\Workspace10AM\\"+str+time+".png"));		
	}
  @Test
  public void captureScreenshot() throws Exception{
	  driver.get("http://spicejet.com");
	  captureScreenshotWithTimeStamp("HomePage");
driver.findElement(By.linkText("Book a Flight")).click();
captureScreenshotWithTimeStamp("BookaFlight");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}


