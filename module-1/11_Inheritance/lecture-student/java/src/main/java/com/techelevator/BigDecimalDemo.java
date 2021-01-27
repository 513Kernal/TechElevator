package com.techelevator;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);

        //bigdecimal is immutable
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b1.add(b2));
        b1 = b1.add(b2); // just calling add doesn't change b1


        BigDecimal number = new BigDecimal("5.56");

        BigDecimal fromDouble = BigDecimal.valueOf(d1);

        if (b3.compareTo(b2) > 0) { //use the comparison symbol that you'd like to put between b3 and b2
            //comparing to 0 is usually best practice
            System.out.println("b3 is greater than b2");
        }
    }
}
