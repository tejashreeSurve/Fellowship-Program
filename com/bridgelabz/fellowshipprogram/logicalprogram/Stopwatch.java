package com.bridgelabz.fellowshipprogram.logicalprogram;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To generate stop watch.
 */
public class Stopwatch {

	public static void main(String[] args) {
		String srt, stp;
		System.out.println("enter srt to start stopwatch\n");
		Scanner scanner = new Scanner(System.in);
		srt = scanner.next();
		long time = System.currentTimeMillis();
		System.out.println("enter stp to stop stopwatch\n");
		stp = scanner.next();
		long time2 = System.currentTimeMillis();
		System.out.println("eplasetime is " + ((time2 - time)) / 1000 + "s");
		scanner.close();
	}
}
