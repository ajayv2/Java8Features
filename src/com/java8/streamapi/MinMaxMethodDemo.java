package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Optional;

public class MinMaxMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(15);
        marks.add(5);
        marks.add(25);
        marks.add(10);
        marks.add(20);
        marks.add(0);
        Optional<Integer> min = marks.stream().min(Integer::compare);
        min.ifPresent(System.out::println);
        Optional<Integer> max = marks.stream().max(Integer::compare);
        max.ifPresent(System.out::println);
    }
}
