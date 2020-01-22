package com.bridgelabz.fellowshipprogram.alogorithm;

/**
 * @author Tejashree Surve
 * @Purpose : To search word form String Array using binary Algorithm.
 */
public class BinaryWordSearch {
	static int toBinary(String[] array, String find) {
		int l = 0, r = array.length - 1;
		while (l <= r) {
			int mid = l + r / 2;
			int result = find.compareTo(array[mid]);
			if (result == 0)
				return 0;
			if (result > 0)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}

	public static void main(String args[]) {
		String array[] = { "apple", "mango", "banana", "kiwi", "lichi" };
		String find = "tamr";
		int result = toBinary(array, find);

		if (result == -1) {
			System.out.println("String is not present");
		} else {
			System.out.println("String is present");
		}

	}
}
