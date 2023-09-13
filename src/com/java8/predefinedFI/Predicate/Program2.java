package com.java8.predefinedFI.Predicate;

import java.util.function.Predicate;

//program to check length of string is greater than 5 using predicate
public class Program2 {
    public static void main(String[] args) {
        Predicate<String> p = s->s.length()>5;
        System.out.println(p.test("V2Solutions"));
    }
}
