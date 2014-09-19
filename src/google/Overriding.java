package google;

public class Overriding extends GoogleLanguages_Parameter{
	public void click(String str){
		selenium.click("link="+str);
		selenium.waitForPageToLoad("30000");
		selenium.type("Email", "jan30selenium");
		selenium.type("Passwd", "selenium");
		selenium.click("signIn");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding o=new Overriding();
		o.openURL();
		o.click("Gmail");

	}

}
