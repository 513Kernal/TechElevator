package com.techelevator;

import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        while (!finished) {

            System.out.println("Please enter your first name: ");
            String firstName = input.nextLine();
            System.out.println("Please enter your last name: ");
            String lastName = input.nextLine();


            NameFormatter nameFormatter = new NameFormatter();
            try {
                String formattedName = nameFormatter.formatName(firstName, lastName);
                System.out.println("Your properly formatted name is : " + formattedName);
                finished = true;
            } catch (NameFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you for using this program!");

    }
}
