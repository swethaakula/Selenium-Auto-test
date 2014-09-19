package dataDrivenFramework;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.thoughtworks.selenium.Selenium;

public class DriverScript {
	public WebDriver driver;
	public Selenium selenium;
	public String str;
  @Test
  public void reUsableScript() throws Exception{
FileInputStream fi=new FileInputStream(
			  "D:\\Workspace10AM\\Selenium_Autotest\\TestData\\Register.xls");
Workbook w=Workbook.getWorkbook(fi);
Sheet s=w.getSheet(0);

for (int i = 1; i <s.getRows(); i++) {
	if(s.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
	{
		if(selenium.isElementPresent(s.getCell(0, i).getContents()))
		{
//driver.findElement(By.id(s.getCell(0, i).getContents())).sendKeys(s.getCell(3, i).getContents());
selenium.type(s.getCell(0, i).getContents(), s.getCell(3, i).getContents());
str="Pass";
		}else{
			str="Fail";
			System.out.println("Fail");
		}
	}
	else if(s.getCell(2, i).getContents().equalsIgnoreCase("dropdown"))
	{
		if(selenium.isElementPresent(s.getCell(0, i).getContents()))
		{
//new Select(driver.findElement(By.id(s.getCell(0, i).getContents()))).selectByVisibleText(s.getCell(3, i).getContents());
	selenium.select(s.getCell(0, i).getContents(), s.getCell(3, i).getContents());
	str="Pass";
		}else{
			str="Fail";
			System.out.println("Fail");	
		}
	}
	else if(s.getCell(2, i).getContents().equalsIgnoreCase("radiobutton")||
			s.getCell(2, i).getContents().equalsIgnoreCase("button")||
			s.getCell(2, i).getContents().equalsIgnoreCase("link")||
			s.getCell(2, i).getContents().equalsIgnoreCase("checkbox"))
	{
		if(selenium.isElementPresent(s.getCell(0, i).getContents()))
		{
		//driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
		selenium.click(s.getCell(0, i).getContents());
		str="Pass";
		}else{
			str="Fail";
			System.out.println("Fail");
		}
	}
	else if(s.getCell(2, i).getContents().equalsIgnoreCase("wait"))
	{
		Thread.sleep(2000);
	}
	else if(s.getCell(2, i).getContents().equalsIgnoreCase("url"))
	{
		driver.get(s.getCell(0, i).getContents());
	}
	
/*	else if(s.getCell(2, i).getContents().equalsIgnoreCase("button"))
	{
		Thread.sleep(1000);
	//	driver.findElement(By.xpath(s.getCell(0, i).getContents())).click();
		selenium.click(s.getCell(0, i).getContents());
	}*/	
}
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  selenium=new WebDriverBackedSelenium(driver, "http://mail.in.com");
	//  driver.get("http://mail.in.com");
	//  driver.findElement(By.cssSelector("input.registernow")).click();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
