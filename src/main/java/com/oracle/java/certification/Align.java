package com.oracle.java.certification;
import java.text.*;
import java.util.Locale;

public class Align {
    public static void main(String[] args) throws ParseException {
        String[] sa = {"111.234", "222.567844444"};
        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        nf.setMaximumFractionDigits(3);

        System.out.println(nf.getMinimumFractionDigits());
        System.out.println(nf.getMaximumFractionDigits());
        for (String s : sa) {
            System.out.println(nf.parse(s));
            System.out.println(nf.format(nf.parse(s)));
        }
    }
}
