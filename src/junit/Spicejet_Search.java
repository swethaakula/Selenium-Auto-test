package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Search {
public WebDriver driver;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
	System.out.println("Started");	
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
	System.out.println("Ended");
}
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();	
		driver.get("http://spicejet.com");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void verifySearch() throws Exception{
		driver.findElement(By.linkText("Book a Flight")).click();
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

}





