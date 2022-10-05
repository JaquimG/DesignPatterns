package Behavior.com.observer;

import java.util.ArrayList;
import java.util.List;

public class PriceServer implements Subject {
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void newPrice(Price price) {
		notifyObservers(price);
		
	}

	private void notifyObservers(Price currentPrice) {
		observers.forEach(o -> o.notify(currentPrice));
		
	}

}
