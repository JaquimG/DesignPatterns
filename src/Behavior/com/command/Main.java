package Behavior.com.command;

public class Main {
	
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		// To turn off the light
		remoteControl.setCommand(lightsOff);
		remoteControl.pressButton();
		
		// To turn on the light
		remoteControl.setCommand(lightsOn);
		remoteControl.pressButton();
	}
}
