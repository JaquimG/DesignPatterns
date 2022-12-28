package Behavior.com.state;

import static Behavior.com.state.InModerationState.*;

public class Main {
	
	public static void main(String[] args) {
		var document = new Document();
		User adminUser = new User(ADMIN_ROLE, "joaquim");
		User contentCreatorUser = new User(CONTENTCREATOR_ROLE, "joaquim_creator");
		
		document.printStatus();
		
		document.publish(contentCreatorUser);
		document.printStatus();
		
		document.publish(contentCreatorUser);
		document.printStatus();
		
		document.publish(adminUser);
		document.printStatus();
		
		document.publish(adminUser);
		
	}

}
