package com.bridgelabz.fellowshipprogram.datastructure;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : Merging two Linked List.
 */
public class Mearginglinkedlist {
	public static void main(String[] args) {

		OrderedList list1 = new OrderedList();
		int[] array = { 1, 3, 5, 7 };
		for (int i = 0; i < array.length; i++) {
			list1 = OrderedList.insertAtEnd(list1, array[i]);
		}
		System.out.println("this is linkedList1");
		Utility.printlist(list1);
		OrderedList list2 = new OrderedList();
		int[] array2 = { 2, 4, 6, 8, 9, 10 };
		for (int i = 0; i < array2.length; i++) {
			list2 = OrderedList.insertAtEnd(list2, array2[i]);
		}
		System.out.println("this is linkedlist2");
		Utility.printlist(list2);
		int size1 = OrderedList.size(list1);
		int size2 = OrderedList.size(list2);
		OrderedList list3 = new OrderedList();
		OrderedList.insertAtEndOfposition(list1, list2, list3);
	}
}
