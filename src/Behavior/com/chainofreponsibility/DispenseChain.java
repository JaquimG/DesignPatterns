package Behavior.com.chainofreponsibility;

public interface DispenseChain {

	void setNextLink(DispenseChain nextChain);
	
	void dispense(Currency currency);
}
