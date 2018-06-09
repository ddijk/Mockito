package com.oracle.java.certification;

class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }

    public void print() {
        System.out.println("printing Feline");
    }
}
public class Cougar extends Feline {
    public String type = "x ";
    public Cougar() {
        System.out.print("cougar ");
    }
    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
        System.out.println();
        this.print();
        super.print();
    }

    public void print() {
        System.out.println("printing Cougar");
    }

    public static void main(String[] args) {
        new Cougar().go();
    }
}
