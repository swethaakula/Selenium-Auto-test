package testNG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintAllLinks {
	public WebDriver driver;
  @Test
  public void verifyLinks() {
 	  driver.get("http://spicejet.com");
	  List<WebElement> str=driver.findElements(By.tagName("a"));
	  System.out.println(str.size());
	  for (int i = 0; i < str.size(); i++) {
		System.out.println(str.get(i).getText());//str[i]
	}
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
