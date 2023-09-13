package com.java8.JODADATETIME;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        Set<String> z = ZoneId.getAvailableZoneIds();
        System.out.println(z);
        ZoneId la = ZoneId.of("Europe/London");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt);
    }
}
