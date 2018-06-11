package com.oracle.java.certification;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MyResource1 implements AutoCloseable {
    public void close() throws IOException { // A1
        System.out.print("1 ");
        List x2 = new ArrayList<>();
    }
}


class MyResource2 implements Closeable {
//    public void close() throws Exception { // A2
        public void close() throws IOException { // A2
        System.out.print("2 ");
    }
}


public class Triangle {
    public static void main(String[] args) throws IOException {
        try (MyResource1 r1 = new MyResource1(); // B1
                MyResource2 r2 = new MyResource2();) { // B2
            System.out.print("t ");
        } finally {
            System.out.print("f ");
        }
    }
}