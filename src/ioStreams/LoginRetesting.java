package ioStreams;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.thoughtworks.selenium.Selenium;

public class LoginRetesting {
	public WebDriver driver;
	public Selenium selenium;
  @Test
  public void verifyLoginWithMultipleCredentials() throws Exception{
FileInputStream fi=new FileInputStream("D:\\Workspace10AM\\Selenium_Autotest\\TestData\\Login.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);
	  driver.get("http://mail.in.com");
for (int i = 1; i < s.getRows(); i++) {
driver.findElement(By.id("f_id")).sendKeys(s.getCell(0, i).getContents());
driver.findElement(By.id("f_pwd")).sendKeys(s.getCell(1, i).getContents());
driver.findElement(By.cssSelector("input.signin")).click();
Thread.sleep(3000);
	if(selenium.isElementPresent("link=Sign out"))
	{
	driver.findElement(By.linkText("Sign out")).click();
	Thread.sleep(1000);
	driver.get("http://mail.in.com");
	}else{
		System.out.println("invalid credential");
	}
	} 

  }
  @BeforeTest
  public void beforeTest() {
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
	  driver=new ChromeDriver();
	  selenium=new WebDriverBackedSelenium(driver, "http://mail.in.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
