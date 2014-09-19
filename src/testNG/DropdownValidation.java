package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DropdownValidation {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://spicejet.com");
	  driver.findElement(By.linkText("Book a Flight")).click();
	  String str="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT";
List<WebElement> str1=new Select(driver.findElement(By.id(str))).getOptions();
System.out.println(str1.size());
int k=0;
for (int i = 0; i < str1.size(); i++) {
	//System.out.println(str1.get(i).getText());
	if(str1.get(i).getText().equalsIgnoreCase("5 Adults"))
	{
		k=1;
		System.out.println(str1.get(i).getText());
		new Select(driver.findElement(By.id(str))).selectByVisibleText(str1.get(i).getText());
	}
}
if(k==0)
{
	System.out.println("Not matching");
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
