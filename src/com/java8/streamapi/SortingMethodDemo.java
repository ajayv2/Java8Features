package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(15);
        marks.add(5);
        marks.add(25);
        marks.add(10);
        marks.add(20);
        marks.add(0);
        System.out.println("Before sorting "+marks);
        System.out.println("Using default natural order");
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting " +sortedMarks);
        System.out.println("Using customized sorting order in descending order");
        List<Integer> descOrder = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(descOrder);

    }
}
