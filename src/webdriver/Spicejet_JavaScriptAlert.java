package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_JavaScriptAlert {
	public WebDriver driver;
	public void openURL(){
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");
	}
	public void bookAFlight(){
		driver.findElement(By.linkText("Book a Flight")).click();
	}
	public void oneWay() throws Exception{
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
	public void alertConfirmation(){
		String str;
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Spicejet_JavaScriptAlert s=new Spicejet_JavaScriptAlert();
		s.openURL();
		s.bookAFlight();
		s.oneWay();
		s.alertConfirmation();
	}

}







