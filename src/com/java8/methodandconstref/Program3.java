package com.java8.methodandconstref;
class Sample{
    Sample(){
        System.out.println("Sample class constructor execution");
    }
}
interface Interf1{
    public Sample get();
}
public class Program3 {
    public static void main(String[] args) {
        Interf1 i = Sample::new;
        Sample sample = i.get();
    }
}
