package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println("Enter the number for Fibonacci you'd like:");
		int f = input.nextInt();

		for (int i = 0; a < f; i++) {
			System.out.print(c + " ");
			c = a + b;
			b = a;
			a = c;
		}
	}



	}


