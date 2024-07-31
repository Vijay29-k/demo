package java_program;

public class Button {
	
	int a; int b; String c;

	public Button(int height, int width, String bName) {
	a = height;
	b = width;
	c = bName;
	}

	public void buttonCreate() {
		System.out.println("Button is created successfully with hieght, width and name as: "+a+" "+b+" "+c);
	}
	
	public void buttonClickable() {
		System.out.println(c+" button is clickable");
	}
	
	public static void main(String[] args) {
		
		Button OK = new Button(10, 20, "OK");
		OK.buttonCreate(); OK.buttonClickable();
		
		Button Cancel = new Button(15, 20, "Cancel");
		Cancel.buttonCreate(); Cancel.buttonClickable();

	}

}
