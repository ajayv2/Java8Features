package com.java8.streamapi;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        System.out.println(l);
        l.stream().forEach(i->System.out.print(i+" "));
        System.out.println();
        Consumer<Integer> c = i->{
            System.out.println("The square of "+i+" is "+(i*i));
        };
        l.stream().forEach(c);
    }
}
