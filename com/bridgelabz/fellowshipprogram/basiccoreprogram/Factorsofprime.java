package com.bridgelabz.fellowshipprogram.basiccoreprogram;

import java.util.*;

/**
 * @author Tejashree Surve
 * @Purpose : To find Factors Of prime Number.
 */
public class Factorsofprime {
	public static void main(String args[]) {
		System.out.println("ENTER THE NUMBER :--\n");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = x;
		prime(x, y);
		scanner.close();
	}

	static void prime(int number, int sameNumber) {
		int i = 2;
		int product = 1;
		do {
			while (i <= number) {
				if (((number % i) == 0)) {
					product = product * i;
					number = number / i;
					System.out.print(i + "  ");
					prime(number, sameNumber);
				}
				i++;
			}
		} while (product != sameNumber);
	}
}
