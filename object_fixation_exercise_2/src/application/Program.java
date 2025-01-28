package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date firstPostDate = sdf.parse("21/06/2018 13:05:44");
		String firstTitle = "Traveling to New Zealand";
		String firstContent = "I'm going to visit this wonderful country";
		Integer firstLikes = 12;
		Post newZealandPost = new Post(firstPostDate, firstTitle, firstContent, firstLikes);


		String comment01 = "Have a nice tripe";
		String comment02 = "Wow, that's awesome!";
		Comment firstComment = new Comment(comment01);
		Comment secondComment = new Comment(comment02);
		newZealandPost.addComment(firstComment);
		newZealandPost.addComment(secondComment);

		System.out.println(newZealandPost);
		
		Date secondPostDate = sdf.parse("28/07/2018 23:14:19");
		String secondTitle = "Good night guys";
		String secondContent = "See your tomorrow";
		Integer secondLikes = 5;
		Post goodNightGuysPost = new Post(secondPostDate, secondTitle, secondContent, secondLikes);

		String comment03 = "Good night";
		String comment04 = "May the force be with you";
		Comment thirdComment = new Comment(comment03);
		Comment fourthComment = new Comment(comment04);
		goodNightGuysPost.addComment(thirdComment);
		goodNightGuysPost.addComment(fourthComment);

		System.out.println(goodNightGuysPost);
	}

}
