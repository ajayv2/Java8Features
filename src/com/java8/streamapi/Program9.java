package com.java8.streamapi;

import java.util.Arrays;

//sort the array and convert sorted array into the stream
public class Program9 {
    public static void main(String[] args) {
        int[] arr = {23,12,1,0,9,78,4};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
        System.out.println();
        //convert object into uppercase in java8
        String[] str = {"java","c","c++","html","javascript","python"};
        Arrays.stream(str).map(String::toUpperCase).forEach(s->System.out.print(s+" "));
    }
}
