package com.java8.lambdaexpr;

interface Interf2{
    public int squareIt(int num);
}
//Program to find square of any given number using lambda expression
public class LambdaExprTwo {
    public static void main(String[] args) {
        Interf2 i = n->n*n;
        System.out.println(i.squareIt(5));
        System.out.println(i.squareIt(25));
    }
}
