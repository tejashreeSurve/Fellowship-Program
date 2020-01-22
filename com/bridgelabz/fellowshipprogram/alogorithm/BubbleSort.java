package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : To sort array using Bubble Sort logic.
 */
public class BubbleSort {

	public static void main(String args[]) {
		int i, noOfElement;
		System.out.println("Enter the Number of  element");
		Scanner scanner = new Scanner(System.in);
		noOfElement = scanner.nextInt();

		int array[] = new int[noOfElement];
		System.out.println("Enter the Array");
		for (i = 0; i < noOfElement; i++) {
			array[i] = scanner.nextInt();

		}

		array = Utility.bubblesort(array);
		System.out.println("Sorted Array: ");
		for (int k = 0; k < noOfElement; k++) {

			System.out.print(array[k] + " ");
		}
		scanner.close();
	}
}