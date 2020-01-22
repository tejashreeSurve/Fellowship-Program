package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : To print the calendar using Stack Linked List.
 */
public class CalanderUsingStackLinkedList {
	public static void main(String[] args) {
		Week week = new Week();
		WeekDay weekDay;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter month\n");
		int month = scanner.nextInt();
		System.out.println("enter year\n ");
		int year = scanner.nextInt();

		String[] m = { "", "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december" };
		int[] days = { 0, 31, 28, 30, 31, 30, 31, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && Utility.leapYear(year)) { // check if month is feb and year is leap year or not

			days[month] = 29;
		}
		int d = Utility.day(month, 1, year);

		for (int i = days[month]; i >= 1; i--) {
			String f = String.format("%2d", i);
			weekDay = new WeekDay(" ", f); // adding date in weekDay object and then in Stack
			week.stackObject.push(weekDay);
		}
		for (int i = d - 1; i >= 0; i--) {
			weekDay = new WeekDay("", "  "); // adding empty string in Stack till start of the month
			week.stackObject.push(weekDay);
		}

		System.out.println("   S   M  Tu   W  Th   F  Sa");
		for (int i = 0; i <= days[month]; i++) {
			for (int j = 0; j < 7; j++) {
				weekDay = week.stackObject.pop(); // pop object from the Stack and then print date
				if (weekDay != null) {
					System.out.print("  " + weekDay.date);
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
