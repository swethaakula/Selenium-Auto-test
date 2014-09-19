package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

public class AssertValidation {
	public WebDriver driver;
	public Selenium selenium;
  @Test
  public void verifyUsername() {
	  driver.get("http://mail.in.com");
/*	if(driver.findElement(By.id("f_id")).isDisplayed()) 
	{
		System.out.println("Available");
	}else{
		System.out.println("Not available");
	}*/
	  if(selenium.isElementPresent("f_idfg"))
	  {
		  System.out.println("Available");
		}else{
			System.out.println("Not available");
	  }
	  
Assert.assertEquals(driver.findElement(By.id("f_id")).isDisplayed(), true);	  
	  Assert.assertEquals(selenium.isElementPresent("f_idgg"), true);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  selenium=new WebDriverBackedSelenium(driver, "http://mail.in.com");
  }
}












