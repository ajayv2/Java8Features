package com.java8.predefinedFI.Function;

import java.util.function.Function;
//Program to find length of given string using Function FI
public class Program2 {
    public static void main(String[] args) {
        Function<String,Integer> f = String::length;
        System.out.println(f.apply("V2Solutions"));
    }
}
