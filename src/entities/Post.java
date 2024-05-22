package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comment = new ArrayList<>();
	
	public Post () {
		
	}
	
	public Post (Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		
	}

	public String getMoment() {
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date;
		return date = sdt.format(new Date());
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	

	public void getComment(Comment comment) {
		this.comment.add(comment);
	}

	@Override
	public String toString() {
		return "\nPost\nmoment = " + getMoment() + "\ntitle = " + title + "\ncontent = " + content + "\nlikes = " + likes;
	}	
	
	public StringBuilder comments() {
	    StringBuilder sb = new StringBuilder();
	    for (Comment c : comment) {
	        sb.append(c.getText()).append("\n");
	    }
	    return sb;
	}
	
	
	
}
