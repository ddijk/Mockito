package com.oracle.java.certification;

import java.io.Closeable;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.stream.Stream;

class MyResource1b implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("1 ");
    }
}
class MyResource2b implements Closeable {
    public void close() throws IOException {
        System.out.println("close 2b");
        throw new IOException();
    }
}
public class TestRes {

    public static void main(String[] args) {
        try (MyResource1b r1 = new MyResource1b();
                MyResource2b r2 = new MyResource2b();) {
            System.out.print("T ");
        } catch (IOException ioe) {
            System.out.print("IOE ");
        } finally {
            System.out.print("F ");
        }
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);
        nums.filter(n -> n % 2 == 1).
        forEach(p -> System.out.print(p));
//        LocalDate date1 = LocalDate.of(2016, Month.JANUARY, 1);
//        LocalDateTime date2 = LocalDateTime.of(2017, Month.JUNE, 1, 1, 1);
//        Period p = Period.between(date1, date2);
//        System.out.print(p.getYears() + ":" + p.getMonths() + ":" + p.getDays());

        int x =012;

        System.out.println("Octal:"+x);
        Arrays.asList("Fred", "Jim", "Sheila")
                .stream()
                .peek(System.out::println)
                .allMatch(s -> s.startsWith("F"));
    }
}

