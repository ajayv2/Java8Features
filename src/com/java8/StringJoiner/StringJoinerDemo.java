package com.java8.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",");
        joinNames.add("UP");
        joinNames.add("Bihar");
        joinNames.add("West Bengal");
        joinNames.add("Odissa");
        System.out.println(joinNames);
        StringJoiner joinCity = new StringJoiner(",","[","]");
        joinCity.add("Varanasi");
        joinCity.add("Chandauli");
        joinCity.add("Gorakhpur");
        System.out.println(joinCity);

        //merge two stringjoiner
        StringJoiner merge = joinCity.merge(joinNames);
        System.out.println(merge);
    }
}
