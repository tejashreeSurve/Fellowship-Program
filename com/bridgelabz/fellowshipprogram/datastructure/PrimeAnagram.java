package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : To find Prime and anagram Number between 1-1000.
 */
public class PrimeAnagram {
	public static void main(String args[]) {
		int[] primeArray = new int[168];
		primeArray = Utility.returnPrimeNumberArray();
		Set<Integer> passSet = new HashSet<Integer>();
		passSet = anagram(primeArray);
		int size = passSet.size();
		int[] setToArray = new int[size];
		int k = 0;
		for (int x : passSet) {
			setToArray[k++] = x;
		}
		int[] sortedArray = new int[size];
		sortedArray = Utility.bubblesort(setToArray);
		int[][] array2d = new int[8][15];
		int f = 0;
		// this for loops covert the single array into 2D array
		for (int m = 0; m < 8; m++) {
			for (int n = 0; n < 15; n++) {
				if ((f < size)) {
					array2d[m][n] = sortedArray[f];
					f++;
				}
			}
		}
		// this print the 2d array which contain both prime and anagram number
		System.out.println("This is the AnagramNumber 2D Array: \n");
		for (int m = 0; m < 8; m++) {
			for (int n = 0; n < 15; n++) {
				String p = String.format("%3d", array2d[m][n]);
				System.out.print(p + "  ");
			}
			System.out.println();
		}
	}

	/**
	 * @Purpose : Method return set of prime number which are anagram.
	 * @param --> int array
	 * @return return set of anagram number from prime number.
	 */
	static Set anagram(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 168; i++) {
			for (int j = 0; j < 168; j++) {
				if (i != j) {
					if (Utility.anagramnumber(arr[i], arr[j])) {
						set.add(arr[i]);
						set.add(arr[j]);
					}
				}
			}
		}
		return set;
	}
}
