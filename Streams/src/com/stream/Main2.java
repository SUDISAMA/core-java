package com.stream;

import java.util.ArrayList;

public class Main2 {
	
	public static void main(String[] args) {
		ArrayList<News> news = new ArrayList<News>();
        news.add(new News(1, "mani", "mani", "good budget"));
        news.add(new News(2, "ravi", "ravi", "not bad,really good"));
        news.add(new News(3, "raju", "raju", "too bad and must be improved budget"));
        news.add(new News(4, "kiran", "kiran", "very good budget"));
        news.add(new News(5, "omkar", "omkar", "need to improve the content"));

        long count = news.stream().filter((e) -> e.getComment().contains("budget")).count();
        System.out.println("The Count of budget in the comments is " + count);
	}

}
