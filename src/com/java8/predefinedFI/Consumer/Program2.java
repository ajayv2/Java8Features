package com.java8.predefinedFI.Consumer;

import java.util.function.Consumer;

class Movie{
    String name;
    Movie(String name){
        this.name = name;
    }
}
public class Program2 {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m->{
            System.out.println(m.name+" ready to release");
        };
        Consumer<Movie> c2 = m->{
            System.out.println(m.name+" It is bigger flop");
        };
        Consumer<Movie> c3 = m->{
            System.out.println(m.name+" storing info in db");
        };
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
        Movie m = new Movie("XYZ");
        cc.accept(m);
    }
}
