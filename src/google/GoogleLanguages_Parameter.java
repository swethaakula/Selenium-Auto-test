package google;
import com.thoughtworks.selenium.DefaultSelenium;
public class GoogleLanguages_Parameter {
public DefaultSelenium selenium;
	protected void openURL(){
selenium=new DefaultSelenium("localhost",1234,"*firefox","http://google.co.in");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}	
	public void click(String str,String str1){
		selenium.click("link="+str);
		selenium.waitForPageToLoad("30000");
		selenium.click("link="+str1);
		selenium.waitForPageToLoad("30000");
	}
	public void click(String str){
		selenium.click("link="+str);
		selenium.waitForPageToLoad("30000");
	}
	public static void main(String[] args) {
		GoogleLanguages_Parameter g=new GoogleLanguages_Parameter();
		g.openURL();
		g.click("Hindi","English");
		g.click("Gmail");
		
	}

}









