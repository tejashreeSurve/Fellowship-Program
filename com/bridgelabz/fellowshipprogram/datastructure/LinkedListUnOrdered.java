package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.Utility.Utility;
import com.bridgelabz.fellowshipprogram.datastructure.UnOrderedList.Node;

/**
 * @author Tejashree Surve
 * @Purpose : Unordered list using Linked List.
 */
public class LinkedListUnOrdered {
	static void printlist(UnOrderedList list) {
		Node last = list.head;
		System.out.println("Linked list\n");
		while (last != null) {

			System.out.println(last.data);
			last = last.next;
		}
	}

	public static String[] listToIntArray(UnOrderedList list) {
		int size = size(list);
		String[] StringArray = new String[size];
		int i = 0;

		Node currNode;
		currNode = list.head;
		while (currNode != null) {

			StringArray[i] = currNode.data;
			i++;
			if (i == size)
				break;
			currNode = currNode.next;
		}
		return StringArray;
	}

	public static int size(UnOrderedList list) {
		int sizeOfList = 0;
		Node currNode;
		currNode = list.head;

		while (currNode != null) {
			sizeOfList++;
			currNode = currNode.next;
		}
		return sizeOfList;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("/home/admin1/tejashree_environment/dir/UnOrderdList.txt"));
		Scanner scanner = new Scanner(System.in);
		String string = bufferedReader.readLine(); // read data from file
		System.out.println("string\n");
		System.out.println(string + "\n");
		String[] stringarray = string.split(" ");
		UnOrderedList list = new UnOrderedList();
		for (int i = 0; i < stringarray.length; i++) {
			list = UnOrderedList.insertAtEnd(list, stringarray[i]); // insert data into linked list
		}
		printlist(list);
		System.out.println("Enter the string to be pop\n");
		String popString = scanner.next();
		list = UnOrderedList.pop(list, popString); // pop given string form linked list

		String[] stringArray = listToIntArray(list);
		String convertedStringArray = Utility.stringArrayToString(stringArray);

		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("/home/admin1/tejashree_environment/dir/UnOrderdList.txt"));
		bufferedWriter.write(convertedStringArray); // write an edited data into file again
		bufferedWriter.close();
		bufferedReader.close();
		scanner.close();
		printlist(list);

	}
}
