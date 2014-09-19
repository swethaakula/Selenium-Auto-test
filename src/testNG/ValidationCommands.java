package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class VAlidationCommands {
	public WebDriver driver;
  @Test
  public void f() {
driver.get("http://spicejet.com");
driver.findElement(By.linkText("Book a Flight")).click();
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
if(driver.findElement(By.id("custom_date_picker_id_2")).isDisplayed())
{
	System.out.println("Available");
}else{
	System.out.println("Not available");
}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
