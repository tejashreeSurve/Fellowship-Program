package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : To find Prime and Anagram number using Stack Linked List.
 */
public class PrimeAnagramUsingStack {
	// Stack Logic
	public static class Stack {
		OrderedList list = new OrderedList();
		int top = -1;

		OrderedList push(int x) {
			top++;
			list = OrderedList.insertAtEnd(list, x);
			return list;
		}
	}

//push value to list and print 
	public static void stackImplement(int[] sortedArray) {
		OrderedList list = new OrderedList();
		Stack stack = new Stack();
		for (int i = 0; i < sortedArray.length; i++) {
			list = stack.push(sortedArray[i]);
		}
		System.out.println("this is reverse linkedlist\n");
		Utility.printReverseList(list);
	}

	public static void main(String[] args) {
		int[] primeArray = new int[168];
		primeArray = Utility.returnPrimeNumberArray();
		Set<Integer> passSet = new HashSet<Integer>();
		passSet = anagram(primeArray);
		System.out.println(passSet);
		int size = passSet.size();
		int[] setToArray = new int[size];
		int k = 0;
		for (int x : passSet) {
			setToArray[k++] = x;
		}
		int[] sortedArray = new int[size];
		sortedArray = Utility.bubblesort(setToArray);
		stackImplement(sortedArray);
	}

// return set of anagram number
	static Set anagram(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		int k = 0;
		for (int i = 0; i < 168; i++) {
			for (int j = 0; j < 168; j++) {
				if (i != j) {
					if (Utility.anagramnumber(arr[i], arr[j])) {
						set.add(arr[i]);
						set.add(arr[j]);
					}
				}
			}
		}
		return set;
	}
}
