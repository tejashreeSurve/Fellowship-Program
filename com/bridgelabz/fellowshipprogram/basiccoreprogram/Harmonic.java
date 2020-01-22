package com.bridgelabz.fellowshipprogram.basiccoreprogram;

import java.util.*;

/**
 * @author Tejashree surve
 * @Purpose : To find n'th harmonic term.
 */
public class Harmonic {
	public static void main(String args[]) {
		int number;
		float sum = 1;
		System.out.println("enter the number to find harmonic");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for (int i = 2; i <= number; i++) {
			sum = sum + (float) 1 / i;
		}
		System.out.println("harmonic value of " + number + "th term is  " + sum);
		scanner.close();
	}
}
