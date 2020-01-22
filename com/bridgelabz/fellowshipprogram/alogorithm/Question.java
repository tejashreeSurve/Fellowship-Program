package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To find the guess Number.
 */
public class Question {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter number\n");
		int power = scanner.nextInt();
		int number = (int) Math.pow(2, power);
		System.out.println("Think any number between " + 0 + "and " + (number - 1));
		int scerate = find(0, number - 1);
		System.out.println("you guess is:  " + scerate);
		scanner.close();
	}

	private static int find(int low, int high) {
		if ((high - low) == 1)
			return low;
		int mid = (low + high) / 2;
		System.out.println("Is it less then this number ?  " + mid);

		boolean result = scanner.nextBoolean();
		if (result == true) {
			return find(low, mid);
		} else {
			return find(mid, high);
		}
	}
}
