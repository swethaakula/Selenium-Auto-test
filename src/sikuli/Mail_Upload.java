package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Mail_Upload { 
	public WebDriver driver;
	public Screen s;
  @Test
  public void f()  throws Exception{
	  driver.get("http://mail.in.com");
	  driver.findElement(By.id("f_id")).sendKeys("jan30selenium");
	  driver.findElement(By.id("f_pwd")).sendKeys("selenium");
	  driver.findElement(By.cssSelector("input.signin")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.linkText("Sign out")).click();	
  }
  @Test
  public void verifyUpload() throws Exception{
	  driver.findElement(By.cssSelector("span.lftcrn.FL")).click();
	  driver.findElement(By.id("f_to")).sendKeys("nag1@gmail.com");
	  driver.findElement(By.id("f_subject")).sendKeys("Testing");
	  s.click("D:\\Workspace10AM\\Images.sikuli\\1389071643407.png");
	  s.click("D:\\Workspace10AM\\Images.sikuli\\1389071671334.png");
s.type("D:\\Workspace10AM\\Images.sikuli\\1389071679378.png", "Android Kit.txt");
s.click("D:\\Workspace10AM\\Images.sikuli\\1389071685701.png");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
	  driver=new ChromeDriver();
	  s=new Screen();
  }

  @AfterTest
  public void afterTest() {
  }

}
