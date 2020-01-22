package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To sort string array using Merge Sort logic.
 */
public class MergeSort {

	public static void mergeSort(String[] array, int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);
		}
	}

	public static void merge(String[] array, int low, int mid, int high) {
		int len1 = mid - low + 1;
		int len2 = high - mid;
		String[] leftArray = new String[len1];
		String[] rightArray = new String[len2];
		for (int p = 0; p < len1; ++p) {
			leftArray[p] = array[low + p];
		}
		for (int q = 0; q < len2; ++q) {
			rightArray[q] = array[mid + 1 + q];
		}
		int k = low;
		int i = 0;
		int j = 0;

		while (i < len1 && j < len2) {
			if (leftArray[i].compareTo(rightArray[j]) > 0) {

				array[k] = rightArray[j];
				j++;
			} else {
				array[k] = leftArray[i];
				i++;
			}
			k++;
		}
		while (i < len1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < len2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		printArray(array);
	}

	static void printArray(String[] array) {
		int sizeOfArray = array.length;
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to element to sort\n");
		int sizeOfArray = scanner.nextInt();
		String[] array = new String[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			array[i] = scanner.next();
		}
		printArray(array);
		mergeSort(array, 0, sizeOfArray - 1);
		System.out.println("this is sorted array\n");
		printArray(array);
		scanner.close();
	}

}
