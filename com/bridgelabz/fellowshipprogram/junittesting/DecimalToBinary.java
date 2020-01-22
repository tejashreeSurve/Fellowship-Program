package com.bridgelabz.fellowshipprogram.junittesting;

import java.util.*;

/**
 * @author Tejashree Surve
 * @Purpose : To convert decimal to binary number.
 */
public class DecimalToBinary {
	static void tobinary(int n) {
		int binary[] = new int[32];
		int i = 0;
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}
		if (i < 8) {
			while (i != 7) {
				binary[i] = 0;
				i++;
			}
		}
		System.out.println("Here is the Decimal to Binary Conversion: ");
		for (int j = i; j >= 0; j--)
			System.out.print(binary[j]);
	}

	public static void main(String args[]) {
		int number;
		DecimalToBinary d = new DecimalToBinary();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		number = scanner.nextInt();
		tobinary(number);
		scanner.close();
	}
}
