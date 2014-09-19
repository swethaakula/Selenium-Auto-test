package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class InformationCommands_Mail {
	public WebDriver driver;
  @Test(enabled=false)
  public void approach1() {
	  driver.get("http://mail.in.com");
	  driver.findElement(By.cssSelector("input.registernow")).click();
	  List<WebElement> str=driver.findElements(By.className("textbox_1"));
	  System.out.println(str.size());
	  for (int i = 0; i < str.size(); i++) {
		System.out.println(str.get(i).getAttribute("id"));
	}
  }
  @Test(enabled=false)
  public void approach2() {
	  driver.get("http://mail.in.com");
	  driver.findElement(By.cssSelector("input.registernow")).click();
	  List<WebElement> str=driver.findElements(By.tagName("input"));
	  System.out.println(str.size());
	  for (int i = 0; i < str.size(); i++) {
		  if(str.get(i).getAttribute("class").equalsIgnoreCase("textbox_1"))
		  {
			  System.out.println(str.get(i).getAttribute("id"));  
		  }
			
	}
  }
  @Test(enabled=false)
  public void printDropdown() {
	  driver.get("http://mail.in.com");
	  driver.findElement(By.cssSelector("input.registernow")).click();
	  List<WebElement> str=driver.findElements(By.tagName("select"));
	  for (int i = 0; i < str.size(); i++) {
		System.out.println(str.get(i).getAttribute("id"));
	}
  }
  @Test
  public void printAlldata() {
	  driver.get("http://mail.in.com");
	  driver.findElement(By.cssSelector("input.registernow")).click();
	  String str=driver.findElement(By.id("tool_tip")).getText();
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
