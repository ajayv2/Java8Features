package com.java8.streamapi;

import java.util.ArrayList;
//program of count method
public class CountDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println(marks);
        long noOfPassed = marks.stream().filter(x -> x > 35).count();
        System.out.println(noOfPassed);
    }
}
