package Structural.com.proxy;

public class Main {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		
		internet.connectToHost("google.com");
		internet.connectToHost("facebook.com");
	}
}
