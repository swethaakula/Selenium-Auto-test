package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
public class Mail_Register {
public DefaultSelenium selenium=new DefaultSelenium("localhost",1234,"*iehta","http://mail.in.com");
public void openURL(){
	selenium.start();
	selenium.open("/");
	selenium.windowMaximize();
}
public void register() throws Exception{
	selenium.click("css=input.registernow");
	selenium.waitForPageToLoad("30000");
	selenium.type("fname", "Nagesh");
	selenium.select("day", "10");
	selenium.select("month", "Aug");
	selenium.select("year", "1983");
	Thread.sleep(1000);
	selenium.click("document.formregister.radiousername[2]");
	Thread.sleep(2000);
	selenium.type("password", "nag123");
	selenium.type("repassword", "nag123");
	selenium.type("altemail", "nag@gmail.com");
	selenium.type("mobileno", "7894561230");
	selenium.click("imageField");
	//selenium.waitForPageToLoad("10000");
	Thread.sleep(2000);
	selenium.click("document.formregister.gender[1]");
	selenium.select("mcountry", "India");
	
}
public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Mail_Register m=new Mail_Register();
		m.openURL();
		m.register();
	}

}
