package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Mail_Login_Register {
	public WebDriver driver;
  @Test
  public void verifyLogin() {
	  driver.get("http://mail.in.com");
		driver.findElement(By.id("f_id")).sendKeys("jan30selenium");
		driver.findElement(By.id("f_pwd")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.signinvbvb")).click();
		driver.findElement(By.linkText("Sign out")).click();	  
  }
  @Test
  public void verifyRegister() throws Exception{
	  driver.get("http://mail.in.com");
		driver.findElement(By.cssSelector("input.registernow")).click();
		driver.findElement(By.id("fname")).sendKeys("Nagesh");
new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jun");
new Select(driver.findElement(By.id("year"))).selectByVisibleText("1983");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@name='radiousername'])[3]")).click();
Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("nag1234");
		driver.findElement(By.id("repassword")).sendKeys("nag1234");
		driver.findElement(By.id("altemail")).sendKeys("nag@gmail.com");
		driver.findElement(By.id("mobileno")).sendKeys("7894561230");
		driver.findElement(By.id("imageField")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();	
  }

  @AfterTest
  public void afterTest() throws Exception{
	  Thread.sleep(2000);
	  driver.quit();
  }

}










