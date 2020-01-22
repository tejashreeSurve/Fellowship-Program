package com.bridgelabz.fellowshipprogram.logicalprogram;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Tejashree Surve
 * @Purpose : To find No Of coupon number.
 */
public class CouponNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		int ran = 0;
		System.out.println("Enter the number of distinct coupon numbers to bew generate\n");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != n) {
			int result = random.nextInt(1000);
			ran++;
			if (set.isEmpty()) {
				set.add(result);
			} else {
				if (set.contains(result)) {
					result = random.nextInt(1000);
					ran++;
					set.add(result);
				} else {
					set.add(result);
				}
			}
		}
		System.out.println(set);
		System.out.println("Number of time random function is call: " + ran);
		scanner.close();
	}
}
