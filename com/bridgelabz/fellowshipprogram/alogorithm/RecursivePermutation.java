package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To find numbers of Combination using recursion.
 */

public class RecursivePermutation {

	public static void main(String[] args) {
		String string;
		System.out.println("Enter the string\n");
		Scanner scanner = new Scanner(System.in);
		string = scanner.next();
		char[] array = new char[string.length()];
		for (int i = 0; i < string.length(); i++)
			array[i] = string.charAt(i);
		recursion(array);
		scanner.close();
	}

	static void recursion(char[] array) {
		int length = array.length;
		int count = 0;
		int fact = factorial(length);
		char[] duplicate = new char[length];

		while (count != fact) {
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {

					duplicate = swap(array, i, j);
					if (i != j) {
						for (char c : duplicate) {
							System.out.print(c);
						}
						count++;
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}

	static char[] swap(char[] array, int a, int b) {    //this method swap the array values 
		char temp;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
	}

	static int factorial(int length) {			// this is calculating factorial of the length of string
		int sum = 1;
		for (int i = length; i >= 1; i--) {
			sum = sum * i;
		}
		return sum;
	}
}
