package ioStreams;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login_TD {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
FileInputStream	fi=new FileInputStream(
			     "D:\\Workspace10AM\\Selenium_Autotest\\TestData\\Login.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);
driver.get("http://mail.in.com");
driver.findElement(By.id("f_id")).sendKeys(s.getCell(0, 1).getContents());
driver.findElement(By.id("f_pwd")).sendKeys(s.getCell(1, 1).getContents());
driver.findElement(By.cssSelector("input.signin")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Sign out")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
