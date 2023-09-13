package com.java8.lambdaexpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Program to sort the integer list
public class LambdaExprThree {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(0);
        l.add(25);
        l.add(5);
       // Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
     //   Comparator<Integer> c = (I1,I2)->I1.compareTo(I2);

        Comparator<Integer> c = Integer::compareTo;
        Collections.sort(l,c);
        System.out.println(l);
    }
}
