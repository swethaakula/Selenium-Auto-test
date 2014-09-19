package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookaHoliday_Inheritance extends ScreenShot{
  @Test
  public void verifyBookaHoliday() throws Exception{
	  driver.get("http://spicejet.com");
	  driver.findElement(By.linkText("Book a Holiday")).click();
	  captureScreenshotWithTimeStamp("BookAholiday");
new Select(driver.findElement(By.id("DestinationID"))).selectByVisibleText("India");
Thread.sleep(3000);
driver.findElement(By.id("LocationID")).click();
driver.findElement(By.xpath("(//input[@id='LocationID'])[2]")).click();
driver.findElement(By.xpath("(//input[@id='LocationID'])[3]")).click();

  }
}
