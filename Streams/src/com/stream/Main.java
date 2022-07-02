package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> al = new ArrayList<Fruit>();
        al.add(new Fruit("apple", 234, 50, "red"));
        al.add(new Fruit("banana", 140, 70, "yellow"));
        al.add(new Fruit("grapes", 1400, 30, "purple"));
        al.add(new Fruit("guava", 160, 50, "green"));

        List<Fruit> sortedList = al.stream().filter((e) -> e.getCalories() < 100)
                .sorted(Comparator.comparing(Fruit::getCalories)).collect(Collectors.toList());
        System.out.println(sortedList);
        List<Fruit> listByColor = al.stream().sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toList());
        System.out.println(listByColor);
        List<Fruit> redColorFru = al.stream().filter((e) -> e.getColor() == "red").collect(Collectors.toList());
        System.out.println(redColorFru);

}
}
