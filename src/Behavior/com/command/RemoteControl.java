package Behavior.com.command;

// This class is an invoke

public class RemoteControl {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}

}
