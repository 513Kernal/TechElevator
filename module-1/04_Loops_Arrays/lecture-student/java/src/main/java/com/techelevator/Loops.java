package com.techelevator;

public class Loops {

    public static void main(String[] args) {

        //Count up
        for (int i = 1; i < 400; i++) {

            System.out.println(i);
        }

        //Count down
        for (int i = 400; i > 0; i--) {

            System.out.println(i);
        }


        //Add up numbers
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);


        //Add up only odd numbers

        // (i % 2 == 1) would show 100 numbers with 1 remainder = odd
        // (i % 2 == 0) would show 100 numbers with 0 remainder = even


        int oddSum = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            oddSum += i;
        }
        System.out.println(oddSum);

    }
}




