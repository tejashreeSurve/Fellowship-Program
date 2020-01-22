package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To find number of Permutation Combination of string.
 */
public class Permutationstring {
	static void combination(char[] array) {
		int length = array.length;
		int numberOfChar = fact(length);
		int count = 0;
		char temp;
		while (count != numberOfChar) {
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					if (i != j) {
						for (char c : array) {
							System.out.print(c);
						}
						count++;
					}
					System.out.println();
				}
			}
		}
	}

	static int fact(int length) {
		int sum = 1;
		for (int i = length; i >= 1; i--)
			sum = sum * i;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the string\n");
		String string;
		Scanner scanner = new Scanner(System.in);
		string = scanner.next();
		char[] array = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			array[i] = string.charAt(i);
		}
		combination(array);
		scanner.close();
	}
}
