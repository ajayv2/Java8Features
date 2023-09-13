package com.java8.streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ToArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        Integer[] array = l.stream().toArray(Integer[]::new);
        for(Integer I : array){
            System.out.print(I+" ");
        }
        System.out.println();
        Stream.of(array).forEach(i->System.out.print(i+" "));
    }
}
