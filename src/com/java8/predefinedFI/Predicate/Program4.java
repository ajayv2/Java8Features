package com.java8.predefinedFI.Predicate;

import java.util.function.Predicate;

//Use of and() , or() and negate() in predicate FI
public class Program4 {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30,35};
        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2 = i->i>10;
        //and()
        System.out.println("The numbers which are even and >10 are: ");
        for(int x1:x){
            if(p1.and(p2).test(x1)){
                System.out.print(x1+" ");
            }
        }
        System.out.println();
        //or()
        System.out.println("The numbers which are even or >10 are: ");
        for(int x1:x){
            if(p1.or(p2).test(x1)){
                System.out.print(x1+" ");
            }
        }
        //negate()
        System.out.println("The numbers which are not even (negation of predicate p1) ");
        for(int x1:x){
            if(p1.negate().test(x1)){
                System.out.print(x1+" ");
            }
        }
    }
}
