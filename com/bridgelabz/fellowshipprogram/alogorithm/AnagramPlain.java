package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To check whether number is anagram and prime number.
 */
public class AnagramPlain {
	public static boolean Anagram(int number) {
		int i;
		for (i = 2; i <= 10; i++) {
			if (number * i == number)
				return true;
		}
		return false;
	}

	public static boolean plaindrom(int i) {
		int digit, count = 0;
		double sum = 0;
		while (i != 0) {
			digit = i % 10;
			count++;
			i = i / 10;
		}
		while (i != 0) {
			digit = i % 10;
			sum = sum + Math.pow(digit, count);
			i = i / 10;
		}
		if (sum == i)
			return true;
		else
			return false;
	}

	public static void check(int number) {
		if (Anagram(number) && plaindrom(number)) {
			System.out.println("NUMBER IS BOTH ANAGRAM AND PLAINDROM NUMBER");
		} else {
			System.out.println("NUMBER IS NOT ANAGRAM AND PLAINDROM NUMBER");
		}
	}

	public static void main(String args[]) {
		int number, i = 1;
		System.out.println("Enter the number\n");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for (int j = 500; j <= 1500; j++) {
			do {
				i++;
			} while (j % i != 0);
			if (j == i)
				check(number);
			else
				System.out.println("Number is not prime number");
		}
		scanner.close();
	}
}
