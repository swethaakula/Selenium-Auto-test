package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AjaxControl {
	public WebDriver driver;
  @Test
  public void f() throws Exception{
driver.get("http://google.co.in");
driver.findElement(By.id("gbqfq")).sendKeys("selenium");
Thread.sleep(1000);
String str; 
str=driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr/td[2]")).getText();
System.out.println(str);
String str1[]=str.split("\n");
System.out.println(str1.length);
for (int i = 0; i < str1.length; i++) {
	//System.out.println(str1[i]);
	if(str1[i].equalsIgnoreCase("selenium tutorial"))
	{
		System.out.println(str1[i]);
		driver.findElement(By.id("gbqfq")).clear();
		driver.findElement(By.id("gbqfq")).sendKeys(str1[i]);
	}
}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
