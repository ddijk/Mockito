package com.oracle.java.certification;

public class App {

    void calcBill() {
        // Line n1
        class Invoice {
            void print() {System.out.println("Invoice Printed");}
        }
        new Invoice().print();
    }
}
