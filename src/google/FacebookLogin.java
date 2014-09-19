package google;
import com.thoughtworks.selenium.DefaultSelenium;
public class FacebookLogin {
public DefaultSelenium selenium;
public void openURL(){
selenium=new DefaultSelenium("localhost",1234,"*firefox","http://facebook.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}
	public void login(){
		selenium.type("id=email", "qqqqqqqq@gmail.com");
		selenium.type("id=pass", "qqqqqqqqqqqq");
		selenium.click("id=loginbutton");
		selenium.waitForPageToLoad("30000");
	}
	public void logout(){
		selenium.click("id=userNavigationLabel");
		selenium.click("css=input.uiLinkButtonInput");	
	}
	public static void main(String[] args) {
		FacebookLogin f=new FacebookLogin();
		f.openURL();
		f.login();
		f.logout();
	}

}
