package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
public class Gmail_Login {
public static void main(String[] args) {
	DefaultSelenium selenium=new DefaultSelenium("localhost",1234,"*firefox","http://gmail.com");
	selenium.start();
	selenium.open("/");
	selenium.windowMaximize();
	selenium.type("Email", "jan30selenium");//This is gmail login
	selenium.type("Passwd", "selenium");
	selenium.click("signIn");
	
}
}
