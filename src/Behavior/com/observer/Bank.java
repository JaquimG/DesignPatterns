package Behavior.com.observer;

public class Bank implements Observer {

	@Override
	public void notify(Price price) {
		
		System.out.println("Notifying the bank: " + price );
	}
}
