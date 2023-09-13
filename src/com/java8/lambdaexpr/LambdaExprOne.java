package com.java8.lambdaexpr;

interface Interf1{
    public void add(int a,int b);
}
public class LambdaExprOne {
    public static void main(String[] args) {
        Interf1 i = (a,b)->System.out.println("The sum of "+a+" and "+b+ " is "+(a+b));
        i.add(10,20);
        i.add(3,9);
        i.add(23,43);
    }
}
