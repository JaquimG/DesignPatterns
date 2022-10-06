package Behavior.com.command;

// This class is a receiver

public class Light {
	
	private boolean isOn;
	
	public void switchOn() {
		isOn = true;
	}
	
	public void switchOff() {
		isOn = false;
	}

}
