package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : To print calendar.
 */
public class Calender {
	public static void main(String[] args) {
		System.out.println("Enter the month\n");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.println("Enter the year\n");
		int year = scanner.nextInt();

		String[] m = { "", "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december" };

		int[] days = { 0, 31, 28, 30, 31, 30, 31, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && Utility.isleapyear(year))
			days[month] = 29; // check whether year is leap year or not.
		System.out.println("  " + m[month] + "  " + year);
		System.out.println(" S   M  Tu   W  Th   F  Sa");

		int d = Utility.day(month, 1, year);

		for (int i = 0; i < d; i++)
			System.out.print("    ");
		for (int i = 1; i <= days[month]; i++) {
			String f = String.format("%2d", i); // print date till seven'th day.

			System.out.print(f + "  ");

			if (((i + d) % 7 == 0) || (i == days[month])) // after seven'th day print date to next line.
				System.out.println();
		}
		scanner.close();
	}

}
