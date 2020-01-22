package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * Purpose : To find weather Number is Anagram or not
 */
public class Anagram {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the String 1: ");

		char string[] = scanner.next().toCharArray();

		System.out.println("Enter the String 2: ");
		char string1[] = scanner.next().toCharArray();
		if (Utility.anagramOrNotForString(string, string1)) {
			System.out.println("both string are Anagram");
		} else {
			System.out.println("both string are not anagram");
		}
		scanner.close();
	}
}
