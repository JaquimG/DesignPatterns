package Behavior.com.templatemethod;

public class Main {
		
	public static void main(String[] args) {
	
		CrossCompiler android = new AndroidCompiler();
		CrossCompiler iphone = new IPhoneCompiler();

		android.compile();
		System.out.println("\n");
		iphone.compile();
		
	}
	

}
