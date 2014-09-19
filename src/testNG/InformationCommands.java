package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class InformationCommands {
	public WebDriver driver;
  @Test(enabled=false)
  public void verifyGoogleSearch_HindiLink_Tooltip() {
	  driver.get("http://google.co.in");
String str=driver.findElement(By.id("gbqfba")).getAttribute("aria-label");
System.out.println("Display name :"+str);
String str1=driver.findElement(By.id("hplogo")).getAttribute("title");
System.out.println("Title is :"+str1);
String str2=driver.findElement(By.linkText("Hindi")).getText();
System.out.println("Link name is :"+str2);
  }
  @Test
  public void contactUSTooltip() {
	  driver.get("http://spicejet.com");
String str=driver.findElement(By.linkText("Contact Us")).getAttribute("title");
System.out.println(str);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
