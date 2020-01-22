package com.bridgelabz.fellowshipprogram.datastructure;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : Print Prime Number form 2D array.
 */
public class PrimeNumberIn2D {
	public static void main(String args[]) {
		int[] primeNumberArray = new int[168];
		primeNumberArray = Utility.returnPrimeNumberArray();
		int[][] array2d = new int[10][25];
		int f = 0;
		int num = 0;
		int rangeNo1 = 0;
		int rangeNo2 = 100;
		for (int m = 0; m < 10; m++) {
			for (int n = 0; n < 25; n++) {
				if ((f < 168)) {
					num = primeNumberArray[f];
					array2d[m][n] = primeNumberArray[f];
					f++;
				}
				if (!(num > rangeNo1 && num < rangeNo2 - 1))
					break;
			}
			rangeNo1 = rangeNo1 + 100; // this increase the range by 100
			rangeNo2 = rangeNo2 + 100;
		}

		int[][] reverseArray = new int[25][10];
		for (int m = 0; m < 10; m++) {
			for (int n = 0; n < 25; n++) {
				reverseArray[n][m] = array2d[m][n];
			}
		}
		System.out.println("100" + "  " + "200" + "  " + "300" + "  " + "400" + "  " + "500" + "  " + "600" + "  "
				+ "700" + "  " + "800" + "  " + "900" + " " + "1000" + "\n");
		for (int m = 0; m < 25; m++) {
			for (int n = 0; n < 10; n++) {
				String p = String.format("%3d", reverseArray[m][n]);
				System.out.print(p + "  ");
			}
			System.out.println();
		}
	}
}
