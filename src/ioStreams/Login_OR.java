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
public class Login_OR {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;	
  @Test
  public void verifyLogin() throws Exception{
fi=new FileInputStream("D:\\Workspace10AM\\Selenium_Autotest\\OR\\LoginOR.xls");
w=Workbook.getWorkbook(fi);
s=w.getSheet("Login");
	  driver.get("http://mail.in.com");
driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys("jan30selenium");
driver.findElement(By.id(s.getCell(1, 1).getContents())).sendKeys("selenium");
driver.findElement(By.cssSelector(s.getCell(2, 1).getContents())).click();
Thread.sleep(3000); 
  }
  @Test
  public void verifyLogout() throws Exception{
	  s=w.getSheet("Logout");
driver.findElement(By.linkText(s.getCell(0, 1).getContents())).click();	  
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
