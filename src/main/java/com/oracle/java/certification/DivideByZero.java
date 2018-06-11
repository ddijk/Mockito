package com.oracle.java.certification;

import java.util.concurrent.Callable;

public class DivideByZero {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        try {
            for (int z = 2; z >= 0; z--) {
                int ans = x / z;
                System.out.print(ans+ " ");
            }
        } catch (ArithmeticException e1) {
            System.out.println("E2");
        } catch (Exception e1) {
            System.out.println("E1");
        }
    }
}

