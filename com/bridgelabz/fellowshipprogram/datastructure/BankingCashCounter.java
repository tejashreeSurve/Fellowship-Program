package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : Implement Banking Cash Counter using Queue.
 */
public class BankingCashCounter {
	private static Scanner scanner;

	static class QueueImplement {
		static int[] queue = new int[10];
		static int front = -1, rare = -1;

		static int capacity = 10;
		static int count;

		static void enqueue(int value) {
			if (capacity == 0)
				System.out.println("Queue is overflow\n");
			else {
				if (front == -1) {
					front++;
					rare++;
					queue[rare] = value;
					capacity--;
					System.out.println("Token Number is added" + "  " + "" + value + "\n");
					System.out.println("List of TokenNUmber\n");
					print();
				} else {
					rare++;
					queue[rare] = value;

					capacity--;
					System.out.println("Token Number " + "  " + value + "is added\n");
					System.out.println("List of TokenNUmber\n");
					print();
				}
			}
		}

		static void dequeue() {
			if (isEmpty()) {
				System.out.println("Queue is empty\n");
			} else {
				System.out.println("Next TokenNumber ");
				front++;
				capacity++;
				print();
			}
		}

		static boolean isEmpty() {
			if (rare == -1 && front == -1)
				return true;
			else
				return false;
		}

		static void addAtLast(int value) {
			rare++;
			queue[rare] = value;
			capacity--;
			System.out.println("TokenNUmber" + "  " + value + "is added\n");
			System.out.println("List of TokenNumber\n");
			print();
		}

		static void print() {
			for (int i = front; i <= rare; i++) {
				System.out.println(queue[i] + "  ");
			}
		}
	}

	public static void main(String[] args) {

		int balance = 50000;
		int tokenNumber = 500;
		scanner = new Scanner(System.in);
		System.out.println("Enter the Number Of Customer in Queue\n");
		int numberofcustomer = scanner.nextInt();
		System.out.println("CASH COUNTER\n");

		int amount;
		for (int i = 1; i <= numberofcustomer; i++) { 		// provide token number to customer
			QueueImplement.enqueue(tokenNumber++);
		}
		while (numberofcustomer != 0) {
			System.out.println("CASH COUNTER\n");
			System.out.println("1.Diposit\n");
			System.out.println("2.Widthdraw\n");
			System.out.println("Enter the option\n");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Amount for Diposit\n");
				amount = scanner.nextInt();
				balance = balance + amount;
				System.out.println("BALANCE:=  " + balance);
				numberofcustomer--;
				QueueImplement.dequeue();		 // dequeue form Queue if balance is greater
				break;

			case 2:
				System.out.println("Enter Amount for Widthdraw\n");
				amount = scanner.nextInt();
				if (amount <= balance) {
					balance = balance - amount;
					System.out.println("BALANCE:=  " + balance);
					numberofcustomer--;
					QueueImplement.dequeue();		 // dequeue form Queue if balance is greater
				} else {
					System.out.println("That much amount is not present");

					boolean b = QueueImplement.isEmpty();
					if ((numberofcustomer == 1) || b) {
						System.out.println("Sorry cash is not available\n");
					} else {
						QueueImplement.addAtLast(tokenNumber); 		// provide new token if balance is not sufficient
						QueueImplement.dequeue();
					}
					numberofcustomer--;
				}
				break;

			default:
				System.out.println("please enter correct option\n");
			}

		}
	}

}
