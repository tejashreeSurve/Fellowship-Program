package com.bridgelabz.fellowshipprogram.functionalprogram;

import java.io.PrintWriter;
import java.util.Scanner;
/**
 * @author Tejashree Surve
 * @Purpose : To print 2D array using printWriter.
 */
public class Array {
	public static void main(String args[]) {
		int m, n;
		String string = "  ";
		System.out.println("enter the number of rows ");
		PrintWriter print = new PrintWriter(System.out);
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextInt();
		System.out.println("enter the number of rows ");
		n = scanner.nextInt();
		int array[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("enter the number");
				array[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				print.write(array[i][j] + "   ");
			}
			print.println();
		}
		print.close();
		scanner.close();
	}
}
