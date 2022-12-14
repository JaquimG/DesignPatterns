package Behavior.com.observer;

public class Price {
	
	private String currency;
	private Double value;
	
	public Price(String currency, Double value) {
		this.currency = currency;
		this.value = value;
	}
	
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "Price [currency=" + currency + ", value=" + value + "]";
	}
	
	
	

}
