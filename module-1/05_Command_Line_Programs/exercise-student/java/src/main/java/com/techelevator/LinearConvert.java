package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		//greet user and have them enter a measurement

		System.out.println("Enter a measurement:");
		String numMeas = input.nextLine();


		System.out.println("Is your measurement in (F)eet or (M)eters Remember to use a capital");
		String measEntered = input.nextLine();


		double originalMeas = Double.parseDouble(numMeas);



		if (measEntered.equals("M"))
		{
			originalMeas = (originalMeas * 0.3048);
			System.out.println(originalMeas);
		}

		else
		{
			originalMeas = (originalMeas * 3.2808399);
			System.out.println(originalMeas);
		}


	}

	}


