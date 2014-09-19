package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Search {
	public WebDriver driver=new FirefoxDriver();
public void openURL(){
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
driver.findElement(By.linkText("31")).click();
new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"))).selectByVisibleText("2 Adults");
new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"))).selectByVisibleText("1 Child");
new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"))).selectByVisibleText("1 Infant");
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Spicejet_Search s=new Spicejet_Search();
		s.openURL();
		s.bookAFlight();
		s.oneWay();
	}

}







