package com.java8.lambdaexpr;

interface Interf
{
    public void m1();
}
public class LambdaExpr {
    public static void main(String[] args) {
        Interf i = ()->System.out.println("First example of lambda expression");
        i.m1();
    }
}
