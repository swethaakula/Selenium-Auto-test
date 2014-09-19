package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.thoughtworks.selenium.Selenium;

public class LoginResults {
	public WebDriver driver;
	public Selenium selenium;
	public String str;
  @Test
  public void f() throws Exception{
//TAke input data from input file 2.Add printed data to Result file	  
	FileInputStream fi=new FileInputStream(
					 "D:\\Workspace10AM\\Selenium_Autotest\\TestData\\Login.xls");
	Workbook w=Workbook.getWorkbook(fi);
	Sheet s=w.getSheet(0);
	FileOutputStream fo=new FileOutputStream(
			   "D:\\Workspace10AM\\Selenium_Autotest\\Results\\LoginResults.xls");
	WritableWorkbook wb=Workbook.createWorkbook(fo);
	WritableSheet ws=wb.createSheet("Results", 0);
for (int i = 1; i < s.getRows(); i++) {
driver.findElement(By.id("f_id")).sendKeys(s.getCell(0, i).getContents());
driver.findElement(By.id("f_pwd")).sendKeys(s.getCell(1, i).getContents());
driver.findElement(By.cssSelector("input.signin")).click();
if(selenium.isElementPresent("link=Sign out"))
{
driver.findElement(By.linkText("Sign out")).click();
Thread.sleep(2000);
driver.get("http://mail.in.com");
str="Pass";
}else{
	str="Fail";
	System.out.println("Fail");
}
Label result=new Label(2,i,str);
ws.addCell(result);
for (int j = 0; j   < s.getColumns(); j++) {
	System.out.println(s.getCell(j, i).getContents());	
	Label un=new Label(j, i, s.getCell(j, i).getContents());
	ws.addCell(un);
		}
	 }
	Label un=new Label(0,0,"Username");
	Label pw=new Label(1,0,"Password");
	Label rs=new Label(2,0,"Result");
	ws.addCell(un);
	ws.addCell(pw);
	ws.addCell(rs);
	wb.write();
	wb.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  selenium=new WebDriverBackedSelenium(driver, "http://mail.in.com");
	  driver.get("http://mail.in.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
