package automation_testing;

public class Calling {

	public static void main(String[] args) throws Exception {
		
		Method m = new Method();
		
		m.launchApp("https://www.facebook.com/");
		m.elementAvailable("email");
		m.elementAvailable("pass");
		m.elementClickable("email", true);
		m.elementClickable("pass", true);
		m.urlContains("facebook");
		m.titleContains("Facebook");
		
		m.closeApp();

	}

}
