package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Example of filter method (find all even numbers from the given list)
public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.println(l);
        List<Integer> evenList = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
