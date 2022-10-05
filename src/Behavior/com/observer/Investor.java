package Behavior.com.observer;

public class Investor implements Observer {

	@Override
	public void notify(Price price) {
		
		System.out.println("Notifying the investor: " + price );
	}

}
