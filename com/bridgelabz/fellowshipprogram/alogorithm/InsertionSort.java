package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To sort array using Insertion Sort logic.
 */
public class InsertionSort {
	public static void main(String args[]) {
		int n, y, j;
		System.out.println("ENTER THE NUMBER OF ELEMENT:\n");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int array[] = new int[n];
		System.out.println("ARRAY:-\n");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 1; i < n; i++) {
			y = array[i];
			for (j = i; j > 0 && y < array[j - 1]; j--)
				array[j] = array[j - 1];
			array[j] = y;
		}
		System.out.println("SORTED ARRAY:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}
