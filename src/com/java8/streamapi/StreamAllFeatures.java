package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamAllFeatures {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        populateList(list);
       // System.out.println(list);
        //1.Fetch all employee whose salary is greater than 30000
        fetchEmployee(list);
        //2.Find the total salary of employee
        totalSalary(list);
        //3.Implementation of limit and skip method

        limitAndSkipDemo(list);
        //fetch all the employee whose name starts with 'V'
        System.out.println("employee whose name starts with V");
        fetchEmployeeWithVName(list);
        //add extra 500 Rs. in employee salary who belong to Kerala
        System.out.println("add extra 500 rs in employee salary");
        add500InEmployeeSalary(list);
        //count no of all male and female employee
        countMaleFemaleEmployee(list);
        //find average


    }
    public static void countMaleFemaleEmployee(List<Employee> list){
        System.out.println();
        long maleCount = list.stream().filter(e -> e.getGender().equals("Male")).count();
        long femaleCount = list.stream().filter(e -> e.getGender().equals("Female")).count();
        System.out.println("Male count is "+maleCount+" and female count is "+femaleCount);
    }
    public static void add500InEmployeeSalary(List<Employee> list){
        list.stream().filter(e->e.getState().equals("Kerala")).peek(e->System.out.print(e+" "))
                .map(e->e.getSalary()+500).forEach(e->System.out.print(e+" "));
    }
    public static void fetchEmployeeWithVName(List<Employee> list){
        list.stream().filter(e->e.getName().startsWith("V")).forEach(System.out::println);
    }
    public static void limitAndSkipDemo(List<Employee> list){
        System.out.println("Demo of limit");
        list.stream().limit(5).forEach(System.out::println);
        System.out.println("Demo of  skip");
        list.stream().skip(6).forEach(System.out::println);
    }
    public static void fetchEmployee(List<Employee> list){
        System.out.println("All employee having salary greater than 30,000");
        list.stream().filter(e->e.getSalary()>30000).forEach(System.out::println);

    }
    public static void totalSalary(List<Employee> list){
        double sum = list.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total salary is "+sum);
        double average = list.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println("average salary is "+average);

    }
    public static void populateList(List<Employee> list){
        list.add(new Employee(1,"Peter",15444,"Male","UP","Kanpur"));
        list.add(new Employee(2,"Vivek",22000,"Male","Kerala","Kochi"));
        list.add(new Employee(3,"Albert",13400,"Male","Kerala","Kannur"));
        list.add(new Employee(4,"Bijay",9990,"Male","Maharashtra","Mumbai"));
        list.add(new Employee(5,"Nirmith",21000,"Female","Madhya Pradesh","Indore"));
        list.add(new Employee(6,"Vikram",44090,"Male","Himachal Pradesh","Palampur"));
        list.add(new Employee(7,"Sanjeev",43900,"Male","Haryana","Gurgaon"));
        list.add(new Employee(8,"Saurabh",31000,"Male","Himachal Pradesh","Shimla"));
        list.add(new Employee(9,"Amol",23304,"Female","Himachal Pradesh","Palampur"));
    }
}
