package com.bridgelabz.fellowshipprogram.basiccoreprogram;

import java.util.*;
import java.io.*;

/**
 * @author Tejashree Surve
 * @Purpose : To find power of number and check whether number is leap year or
 *          not
 */
public class Poweroftwo {
	public static void main(String args[]) {
		int number;
		int sum = 1;
		System.out.println("enter the number for power of two");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println("Table of 2^" + number);
		for (int i = 1; i <= number; i++) {
			sum = sum * 2;
			System.out.println("2^" + i + "=" + sum);
		}
		System.out.println("\n");
		for (int i = 0; i < number; i++) {
			sum = sum * 2;
		}
		System.out.println("Whether year is leap year or not\n");
		if (sum % 4 == 0) {
			if (sum % 100 == 0) {
				if (sum % 400 == 0)
					System.out.println("it is a leap year");

			} else
				System.out.println("it is not a leap year");
		} else
			System.out.println("it is a leap year");
		scanner.close();
	}

}
