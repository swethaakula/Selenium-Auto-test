package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SpicejetPopup_Dynamic {
	public WebDriver driver;
	  @Test(description="Verify the URL")
	  public void test1() {
			driver.get("http://spicejet.com");
	  }
	  @Test(description="Verify the BookAFlight")
	  public void test2(){
		  driver.findElement(By.linkText("Book a Flight")).click();	  
	  }
	  @Test(description="Verify the Oneway search")
	  public void test3() throws Exception{
		  driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
			driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
			driver.findElement(By.linkText("Hyderabad (HYD)")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Bengaluru (BLR)")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("15")).click();
			new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"))).selectByVisibleText("2 Adults");
			new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"))).selectByVisibleText("1 Child");
			new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"))).selectByVisibleText("1 Infant");
			driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
			Thread.sleep(1000);
	  }
	  @Test(description="Verify the javascript alert")
	  public void test4(){
			String str;
			str=driver.switchTo().alert().getText();
			System.out.println(str);
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
	  }
	  @Test(description="Verify the currency convertor popup")
	  public void test5() throws Exception{
	String str=driver.getWindowHandle();
	driver.findElement(By.linkText("Currency Converter")).click();
	Set<String> windows=driver.getWindowHandles();
	Object s[]=windows.toArray();
	driver.switchTo().window(s[1].toString());
	new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");
	new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ButtonCloseWindow")).click();
	driver.switchTo().window(str);
	new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1"))).selectByVisibleText("Bhopal (BHO)");
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
