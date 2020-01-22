package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.Utility.Utility;
import com.bridgelabz.fellowshipprogram.datastructure.OrderedList.Node;

/**
 * @author Tejashree Surve
 * @Purpose : Ordered list using Linked List.
 */
public class LinkedListUsingOrderedClass {
	public static void main(String[] args) throws IOException {
		String stringFromFile;
		File file = new File("/home/admin1/tejashree_environment/dir/OrderedLIst.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		stringFromFile = bufferedReader.readLine(); // read the data from file
		System.out.println(stringFromFile);
		String[] arrSplit = Utility.splitingStringByScapeReturnStringArray(stringFromFile);
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.print(arrSplit[i] + "  " + "\n");
		}
		System.out.println();
		int intArray[] = Utility.stringArrayToIntArray(arrSplit); // this create the array of integer
		System.out.println("This is Entered Integer data: ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.print(intArray[i] + " " + "\n");
		}
		int[] sortedArray = new int[intArray.length];
		sortedArray = Utility.bubblesort(intArray);
		OrderedList list = new OrderedList();
		for (int i = 0; i < sortedArray.length; i++) { // adding sorted data into linked list
			list = OrderedList.insertAtEnd(list, sortedArray[i]);
		}
		System.out.println("this is sorted linkedlist\n");
		Utility.printlist(list); // this will print sorted array
		System.out.println("Enter the number u want to pop\n");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		list = OrderedList.pop(list, number); // pop given number form Linked list
		int[] integerArray = Utility.listToIntArray(list);
		String string = Utility.intArraytoString(integerArray);
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("/home/admin1/tejashree_environment/dir/OrderedLIst.txt"));
		bufferedWriter.write(string); // write the modified data into file
		bufferedWriter.close();
		bufferedReader.close();
		scanner.close();
		Utility.printlist(list);
	}
}
