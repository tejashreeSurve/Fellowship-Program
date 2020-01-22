package com.bridgelabz.fellowshipprogram.basiccoreprogram;

import java.util.*;

/**
 * @author admin1
 * @Purpose : To replace string with user string.
 */
public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello <<Username>>,How are you?\n");
		String string = new String("Hello <<Username>>,How are you?");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME\n ");
		String string1 = scanner.nextLine();
		string = string.replaceAll("<<Username>>", string1);
		System.out.println(string);
		scanner.close();
	}
}
