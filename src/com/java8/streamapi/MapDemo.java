package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Add extra 5 marks in given student marks using map method
public class MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(25);
        marks.add(30);
        System.out.println(marks);
        List<Integer> updatedMarks = marks.stream().map(x -> x + 5).collect(Collectors.toList());
        System.out.println(updatedMarks);

    }
}
