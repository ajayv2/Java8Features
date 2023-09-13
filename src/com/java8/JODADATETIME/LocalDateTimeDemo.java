package com.java8.JODADATETIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date is ");
        System.out.format("%d-%s-%d ",dt.getDayOfMonth(),dt.getMonth(),dt.getYear());
        System.out.println();
        System.out.println("Time is ");
        System.out.format("%d:%d:%d.%d",dt.getHour(),dt.getMinute(),dt.getSecond(),dt.getNano());
        LocalDate dtt = LocalDate.of(1994, Month.OCTOBER,22);
        LocalDate today = LocalDate.now();
        Period p = Period.between(dtt,today);
        System.out.printf("Age is %d years %d months and %d days ",p.getYears(),p.getMonths(),p.getDays());
    }
}
