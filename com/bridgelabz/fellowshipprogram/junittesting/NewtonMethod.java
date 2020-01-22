package com.bridgelabz.fellowshipprogram.junittesting;

import java.util.*;

/**
 * @author Tejashree Surve
 * @Purpose : Newton Method.
 */
public class NewtonMethod {
	static void sqrt(double c) {
		double epsilon = 1e-15;
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) * 2.0;
			System.out.println(t);
		}
	}

	public static void main(String args[]) {
		double c;
		System.out.println("enter nonnegative number");
		Scanner scanner = new Scanner(System.in);
		c = scanner.nextDouble();
		sqrt(c);
		scanner.close();
	}
}
