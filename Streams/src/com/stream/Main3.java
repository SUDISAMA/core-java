package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
	public static void main(String[] args) {
		 ArrayList<Transaction> transList = new ArrayList<Transaction>();
	        transList.add(new Transaction(new Trader("shivani", "bangalore"), 2002, 5000));
	        transList.add(new Transaction(new Trader("satyam", "Odhisa"), 2011, 15000));
	        transList.add(new Transaction(new Trader("jagan", "up"), 2009, 10000));
	        transList.add(new Transaction(new Trader("kiran", "pune"), 2014, 20000));
	        transList.add(new Transaction(new Trader("pinu", "bangalore"), 2017, 25000));
	        transList.add(new Transaction(new Trader("pretti", "Mumabi"), 2020, 15000));
	        transList.add(new Transaction(new Trader("swati", "pune"), 2021, 34000));
	        List<Transaction> sortedListByValue = transList.stream().filter((e) -> e.getYear() == 2011)
	                .sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
	        System.out.println(sortedListByValue);
	        List<String> cities = transList.stream().map((e) -> e.getTrader().getCity()).distinct()
	                .collect(Collectors.toList());
	        System.out.println(cities);
	        List<Transaction> sortingByName = transList.stream().filter((e) -> e.getTrader().getCity() == "pune")
	                .collect(Collectors.toList());
	        System.out.println(sortingByName);
	        // List<Trader>
	        // sortingByNameInAlph=transList.stream().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
	        List<Transaction> delhiList = transList.stream().filter((e) -> e.getTrader().getCity() == "Delhi")
	                .collect(Collectors.toList());
	        System.out.println(delhiList);
	        // transList.stream().map((e)->e.getValue()).forEach(System.out::println);
	        int max = transList.stream().map((e) -> e.getValue()).max(Integer::compare).get();
	        System.out.println("max value is " + max);
	        int min = transList.stream().map((e) -> e.getValue()).min(Integer::compare).get();
	        System.out.println("Min value is " + min);
	    }
	

}
