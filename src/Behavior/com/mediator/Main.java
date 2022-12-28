package Behavior.com.mediator;

public class Main {
	
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		var tv = new Tv(mediator);
		var remoteControlButton = new Button(mediator);
		var display = new Display(mediator);
		
		mediator.setTv(tv);
		mediator.setPowerDisplay(display);
		
		System.out.println("fan.isOn(): " + tv.isOn());
		
		remoteControlButton.press();
		System.out.println("fan.isOn(): " + tv.isOn());
		
		remoteControlButton.press();
		System.out.println("fan.isOn(): " + tv.isOn());
	}

}
