package com.techelevator;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Discount Calculator");
        //prompt user to enter a price
        //prompt user to enter a discount percentage
        //calculate discounted price
        //Print out the discounted price


        //while loop would allow to wrap over and over, just specify condition to stop

        boolean finished = false;
        while (finished == false) {


            System.out.print("Please enter a list of prices separated by spaces:");
            Scanner input = new Scanner(System.in);
            String prices = input.nextLine();
            String[] priceArray = prices.split(" ");

            System.out.print("Enter a discount percentage(20 for 20% discount, for example):");
            String discount = input.nextLine();

            //calculate the total price
            double total = 0;
            for (int i = 0; i < priceArray.length; i++) {
                double undiscountedPrice = Double.parseDouble(priceArray[i]);
                total += undiscountedPrice;
            }


            int discountPercent = Integer.parseInt(discount);
            double discountAmount = total * (discountPercent / 100.00);
            double discountedTotal = total - discountAmount;

            System.out.format("The total price is: $%.2f.\n", total);
            System.out.format("The discounted total is: $%.2f.\n", +discountedTotal);

            System.out.println("Are you finished? (y/n)? ");
            String response = input.nextLine();
            if (response.equals("y")) {
                finished = true;
            }

        }






        System.out.println("Thank you for using the Discount Calculator");
        System.out.println("This has been a Tech Elevator exercise");
        System.out.println("Kris Hasty \nCohort 10 Java\nSpring 2021");




    }
}
