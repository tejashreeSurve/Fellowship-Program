package com.bridgelabz.fellowshipprogram.basiccoreprogram;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To check whether year is leap year or not.
 */
public class LeapYear {
	public static void main(String args[]) {
		int number, digit, count = 0, noOfDigit = 4;
		System.out.println("enter the year");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		while (number != 0) {
			digit = number % 10;
			count++;
			number = number / 10;
		}
		if (count == noOfDigit) {
			if (number % 4 == 0) {
				if (number % 100 == 0) {
					if (number % 400 == 0)
						System.out.println("it is a leap year");
				} else
					System.out.println("it is not a leap year");
			} else
				System.out.println("it is a leap year");

		} else {
			System.out.println("Please enter the 4 digit number");
		}
		scanner.close();
	}
}
