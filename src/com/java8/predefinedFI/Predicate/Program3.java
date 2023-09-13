package com.java8.predefinedFI.Predicate;

import java.util.function.Predicate;
//Use of predicate FI using string array
public class Program3 {
    public static void main(String[] args) {
        String[] s = {"Java","JavaScript","Python","Oracle","MongoDB"};
        Predicate<String> p = str->str.length()>5;
        for(String ss:s){
            if(p.test(ss)){
                System.out.println(ss);
            }
        }
    }
}
