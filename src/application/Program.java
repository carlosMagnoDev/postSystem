package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.print("enter your post data:\n");

		String date = sdt.format(new Date());
		Date moment = sdt.parse(date);
		
		System.out.print("Title:");
		String title = input.nextLine();
		
		System.out.print("Content:");
		String content = input.nextLine();
		
		System.out.print("Likes:");
		Integer likes = input.nextInt();
		
		Post post = new Post(moment, title, content, likes);
		
		System.out.print("Enter how many comments you have on the post:");
		int n = input.nextInt();
		
		Comment comment = new Comment();
		for (int i = 0; i < n; i++) {

			System.out.printf("Coment %d: ", i + 1);
			String text = input.next();
			StringBuilder buildText = new StringBuilder(text);
			post.getComment(new Comment(buildText));
		}
		
		System.out.println(post.toString());
		System.out.println("Comments:");
		System.out.println(post.comments());
		
		input.close();
		//See you tomorrow Good night guys
	}
}
