package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

/**
 * @author Teajshree Surve
 * @Purpose : To check whether String is Plaindrome or not using Queue.
 */
public class DequeuePlaindrome {
	static class QueueImplement {
		static char[] queue = new char[10];
		static int front = -1, rare = -1;
		static int capacity = 10;
		static int count;

		static void enqueue(char value) {
			if (capacity == 0)
				System.out.println("Queue is overflow\n");
			else {
				if (front == -1) {
					front++;
					rare++;
					queue[rare] = value;
					capacity--;

					System.out.println("value add sussfully" + "  " + "" + value + "\n");
					System.out.println("THIS IS QUEUE\n");
					print();
				} else {
					rare++;
					queue[rare] = value;

					capacity--;

					System.out.println("value add sussfully" + "  " + value + "\n");
					System.out.println("THIS IS QUEUE\n");
					print();
				}
			}
		}

		static char removeFront() {
			char element;
			if (isEmpty())
				return '\0';
			else {
				element = queue[front];
				front++;
				return element;
			}

		}

		static char removeRare() {
			char element;
			if (isEmpty())
				return '\0';
			else {
				element = queue[rare];
				rare--;
				return element;
			}
		}

		static boolean isEmpty() {
			if (rare == -1 && front == -1)
				return true;
			else
				return false;
		}

		static void print() {
			for (int i = front; i <= rare; i++) {
				System.out.println(queue[i] + "  ");
			}
		}
	}

	static boolean isplaindrome(char[] array) {
		boolean status = true;
		for (int i = 0; i < array.length; i++) {
			QueueImplement.enqueue(array[i]);
		}
		while ((QueueImplement.front < QueueImplement.rare) || (QueueImplement.front == QueueImplement.rare)) {
			char a = QueueImplement.removeFront();
			char b = QueueImplement.removeRare();
			if ((a == b) && status == true) { // check if the front and the rare character is same till middle of Queue
				status = true;
			} else {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String\n");

		String string = scanner.next();
		char[] character = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			character[i] = string.charAt(i);
		}
		if (isplaindrome(character)) {
			System.out.println("String is plaindrome");
		} else {
			System.out.println("String is not plaindrome");
		}
		scanner.close();
	}
}
