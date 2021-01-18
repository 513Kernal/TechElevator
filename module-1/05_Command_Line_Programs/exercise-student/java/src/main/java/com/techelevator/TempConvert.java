package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);



		//greet user and have them enter a temp and add a f or c for their said temp

		System.out.println("Enter a temperature:");
		String tempNum = input.nextLine();


		System.out.println("Is your temperature in (F)ahrenheit or (C)elsius?");
		String tempEntered = input.nextLine();


		double originalTemp = Double.parseDouble(tempNum);



		if (tempEntered.equals("F"))
		{
			originalTemp = originalTemp * 1.8 + 32;
			System.out.println(originalTemp);
		}

		else
		{
			originalTemp = (originalTemp - 32) / 1.8;
			System.out.println(originalTemp);
		}


	}

}
