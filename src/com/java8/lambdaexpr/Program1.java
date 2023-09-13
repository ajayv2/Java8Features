package com.java8.lambdaexpr;

//program to multiply 2 nos using functional interface
interface Innterf{
    public int multiply(int a,int b);


}
public class Program1 {
    public static void main(String[] args) {
        Innterf i = (a,b)->a*b;
        System.out.println(i.multiply(4,5));
    }
}
