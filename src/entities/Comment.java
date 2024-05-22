package entities;

public class Comment {
	
	private StringBuilder text = new StringBuilder();
	
	public Comment () {
		
	}
	
	public Comment (StringBuilder text) {
		this.text.append(text);
	}
	
	public void appendComment (String comment) {
		text.append(comment);
	}

	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}
	
	
	
}
