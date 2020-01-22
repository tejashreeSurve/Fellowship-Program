package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : Replace String using regex.
 */
public class Message {
	static boolean name3(String name, String fullname, String contact, String date) {
		String name1, fullname1, contact1, date1;
		boolean value;
		name1 = "\\w+";
		fullname1 = "\\w+\\s\\w+\\s\\w+"; // Any word character, short for [a-zA-Z_0-9]
		contact1 = "^\\d{10}"; // exact 10 digit
		date1 = "((([0]{1}[1-9]{1})|([1]{1}[0-9]{1})|([2]{1}[0-9]{1})|([3]{1}[0-1]{1}))/(([0]{1}[1-9]{1})|([1]{1}[0-2]{1}))/([1-9]{1}[0-9]{1}[0-9]{1}[1-9]{1}))";
		// 31 days in month/12 month /any 4 digit for year
		if ((name.matches(name1)) && (fullname.matches(fullname1)) && (contact.matches(contact1))
				&& (date.matches(date1)))
			return value = true;
		else
			return value = false;
	}

	public static void main(String args[]) {
		System.out.println("THIS IS THE GIVEN MESSAGE  :----\n");
		String string = new String(" Hello <<name>>,");
		System.out.println(string);
		String string1 = new String("We have your full name as <<full name>> in our system.");
		System.out.println(string1);
		String string2 = new String("your contact number is 91-xxxxxxxxxx.");
		System.out.println(string2);
		String string3 = new String("Please,let us know in case of any clarification");
		System.out.println(string3);
		String string4 = new String("Thank you BridgeLabz 01/01/2016.");
		System.out.println(string4);
		String string5 = new String("Use Regex to replace name, full name, Mobile#, and Date with proper value.\n");
		System.out.println(string5);
		String name, fullname, contact, date;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER NAME,FULL-NAME,CONTACT-NUMBER & DATE\n");
		name = scanner.nextLine();
		fullname = scanner.nextLine();
		contact = scanner.nextLine();
		date = scanner.nextLine();
		name3(name, fullname, contact, date);
		System.out.println("THIS IS MODIFIED MESSAGE\n");
		if (name3(name, fullname, contact, date)) {
			System.out.println(string.replace("<<name>>", name));
			System.out.println(string1.replace("<<full name>>", fullname));
			System.out.println(string2.replace("xxxxxxxxxx", contact));
			System.out.println(string3);
			System.out.println(string4.replace("01/01/2016", date));
			System.out.println(string5);
		} else {
			System.out.println("PLEASE ENTER VALIDE INFORMATION\n");
		}
		scanner.close();
	}
}
