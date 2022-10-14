package Behavior.com.chainofreponsibility;

import java.util.Scanner;

public class Main {
	
	private final DispenseChain dispenseChain;
	
	public Main() {
		
		this.dispenseChain = new Dollar50Dispenser();
		DispenseChain dispenseChain2 = new Dollar20Dispenser();
		DispenseChain dispenseChain3 = new Dollar10Dispenser();
		
		dispenseChain.setNextLink(dispenseChain2);
		dispenseChain2.setNextLink(dispenseChain3);
		
	}
	
	public static void main(String[] args) {
		Main mainDispenser = new Main();
		while(true) {
			int amount = 0;
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if(amount % 10 != 0 || amount <= 0) {
				System.out.println("Amount should be in multiple of 10s");
				return;
			}
			mainDispenser.dispenseChain.dispense(new Currency(amount));
		}
	}

}
