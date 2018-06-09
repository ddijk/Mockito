package com.oracle.java.certification;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oracle.java.certification.MyStuff;

public class MyStuffTest {


    @Test
    public void testHashcode() {
        MyStuff m1 = new MyStuff("guitar");
        MyStuff m2 = new MyStuff("drums");


        assertFalse(m1==m2);
        assertTrue(m1.equals(m2));
     //   assertEquals(m1.hashCode(), m2.hashCode());
    }

    @Test
    public void verifyNullCheck() {

        MyStuff m1 = new MyStuff("guitar");
        assertFalse(m1.equals(null));
    }

}