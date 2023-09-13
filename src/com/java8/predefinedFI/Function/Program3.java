package com.java8.predefinedFI.Function;

import java.util.function.Function;

//Program to find grade of the student based on the marks
class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class Program3 {
    public static void main(String[] args) {
        Function<Student,String> f = s->{
          int marks = s.marks;
          String grade = "";
          if(marks >=80){
              grade = "A";
          }else if(marks >= 60){
              grade = "B";
          }else if(marks >= 50){
              grade = "C";
          }else if(marks >= 35){
              grade = "D";
          }else{
              grade = "E";
          }
          return grade;
        };
        Student[] s = {new Student("Durga",100),new Student("Sunny",65),
                        new Student("Chinny",45)};
        for(Student s1:s){
            System.out.print("Student name : "+s1.name);
            System.out.print(" Student marks : "+s1.marks);
            System.out.println(" Student grade : "+ f.apply(s1));
        }
    }
}
