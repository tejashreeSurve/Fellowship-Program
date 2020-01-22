package com.bridgelabz.fellowshipprogram.junittesting;

import java.util.*;

/**
 * @author Tejashree Surve
 * @Purpose : To convert temperature from celsius to fahrenheit or v/s .
 */
public class Temperature {
	static void temperatureconversion(int n) {
		double t, a, celsius, fahrenheit;
		Scanner scanner = new Scanner(System.in);
		if (n == 1) {
			System.out.println("enter the temperature in fahrenheit");
			t = scanner.nextDouble();
			celsius = (t - 32) * 5 / 9;
			System.out.println("fahrenheit to celsius: " + celsius);
		} else {
			System.out.println("enter the temperature in celsius");
			a = scanner.nextDouble();
			fahrenheit = (a * 9 / 5) + 32;
			System.out.println(" celsius to fahrenheit: " + fahrenheit);
		}
		scanner.close();
	}

	public static void main(String args[]) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 if change the temperature to Celsius or 0 for fahrenheit");
		number = scanner.nextInt();
		temperatureconversion(number);
		scanner.close();
	}
}
