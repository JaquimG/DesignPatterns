package Behavior.com.state;
public abstract class DocumentState implements State {
	
	protected Document document;
	
	public DocumentState(Document document) {
		this.document = document;
	}

}