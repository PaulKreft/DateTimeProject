package de.neuefische.paulkreft;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalDateTime inTwoWeeks = time.plusWeeks(2);
        System.out.println(inTwoWeeks);

        LocalDateTime futureDateTime = LocalDateTime.now().plusWeeks(1);

        System.out.println("Is Before: " + time.isBefore(futureDateTime));
        System.out.println("Is After: " + time.isAfter(futureDateTime));

        System.out.println("Difference: " + ChronoUnit.DAYS.between(time, inTwoWeeks));
    }
}