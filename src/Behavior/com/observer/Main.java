package Behavior.com.observer;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Investor investor = new Investor();
		
		PriceServer priceServer = new PriceServer();
		
		priceServer.registerObserver(investor);
		priceServer.registerObserver(bank);
		
		priceServer.newPrice(new Price("USD", 5.0));
		
	}
}
