package com.java8.methodandconstref;

interface Interf{
    public void add(int a,int b);
}
public class Program2  {
    public static void sum(int a,int b){
        System.out.println("The addition of "+a+ " and "+b+ " is "+(a+b));
    }
    public static void main(String[] args) {
        Interf i = (a,b)-> System.out.println("The sum of "+a+ " and "+b+ " is "+(a+b));
        i.add(4,5);
        Interf i1 = Program2::sum;
        i1.add(32,32);
    }
}
