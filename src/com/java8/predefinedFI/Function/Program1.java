package com.java8.predefinedFI.Function;

import java.util.function.Function;

public class Program1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(4));
        System.out.println(f.apply(5));
    }
}
