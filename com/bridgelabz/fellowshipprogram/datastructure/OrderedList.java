package com.bridgelabz.fellowshipprogram.datastructure;

import com.bridgelabz.fellowshipprogram.Utility.Utility;

/**
 * @author Tejashree Surve
 * @Purpose : Ordered Linked List Logic.
 */

public class OrderedList {
	public Node head;

	public static class Node {
		public int data;
		public Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/**
	 * @Purpose : method pop the value from the linked list as per position of the
	 *          data.
	 * @param list -> it pass the list.
	 * @param data -> it pass value or data that to removed from list.
	 * @return : return modified linked list
	 */
	public static OrderedList pop(OrderedList list, int n) {
		Node currNode = list.head;
		Node prevNode = null;
		// case 1 : if the value is the first node.
		if (currNode != null && currNode.data == n) {
			list.head = currNode.next;
			System.out.println("value is found and deleted");
			return list;
		}
		// case 2 : if the value is in middle or last or some where else.
		while (currNode != null && currNode.data != n) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		if (currNode != null) {
			prevNode.next = currNode.next;
			System.out.println("value is found and deleted");
		}
		// case 3 : if value not found.
		if (currNode == null) {
			System.out.println("value is not in list");
			list = insertatposition(list, n);
		}
		return list;
	}

	/**
	 * @Purpose : Method insert value according to position.
	 * @param list -> it pass the list.
	 * @param data -> it pass value or data to add in the new node.
	 * @return : return modified Linked List.
	 */

	public static OrderedList insertatposition(OrderedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		Node currNode, prevNode = null;
		currNode = list.head;
		Node last = list.head;
		while (last.next != null) {
			last = last.next;
		}
		// case 1 : adding value at first position itself.
		if (newNode.data < currNode.data) {
			newNode.next = currNode;
			list.head = newNode;
			System.out.println("new node is add with data as " + data);
			return list;
		}
		// case 2 : adding value at the last node of Linked List.
		if (newNode.data > last.data) {
			while (currNode.data < newNode.data && currNode.next != null) {
				prevNode = currNode;
				currNode = currNode.next;
			}
			currNode.next = newNode;
			System.out.println("new node is add with data as " + data);
			return list;
		}
		// case 3 : adding value at the middle position of Linked List.
		while (currNode.data < newNode.data) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = newNode;
		newNode.next = currNode;
		System.out.println("new node is add with data as " + data);
		return list;
	}

	/**
	 * @Purpose : method to insert the new node at the end of the linked list.
	 * @param list -> it pass the list.
	 * @param data -> it pass value of integer array as per index.
	 * @return : return modified Linked List.
	 */
	public static OrderedList insertAtEnd(OrderedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	/**
	 * @Purpose : method search value from linked list.
	 * @param list -> it pass the list.
	 * @param data -> it pass value of integer array as per index.
	 * @return : return boolean value.
	 */
	public static boolean searchValueFromLinkedList(OrderedList list, int dataToBeSearch) {
		Node currNode = list.head;
		while (currNode != null) {
			if (currNode.data == dataToBeSearch)
				return true;
			currNode = currNode.next;
		}
		return false;
	}

	/**
	 * @Purpose : method to return size of Linked List.
	 * @param list -> it pass the list.
	 * @return : return integer value.
	 */
	public static int size(OrderedList list) {
		int size = 0;
		Node currNode;
		currNode = list.head;
		System.out.println("Linked list: \n");
		while (currNode != null) {
			size++;
			currNode = currNode.next;
		}
		return size;
	}

	/**
	 * @Purpose : method to insert value at the end of Hashing Function Linked List.
	 * @param list -> it pass the list.
	 * @param data -> it pass the first node to add in Linked List.
	 * @return : return modified Linked List.
	 */
	public static OrderedList insertAtEndOfHasing(OrderedList list, Node node) {
		node.next = null;
		if (list.head == null) {
			list.head = node;
		}
		return list;
	}

	/**
	 * @Purpose : method to insert value form two list into third Linked List.
	 * @param list -> it pass the three Linked list.
	 */
	public static void insertAtEndOfposition(OrderedList list1, OrderedList list2, OrderedList list3) {
		Node curr1 = list1.head;
		Node curr2 = list2.head;
		int size2 = OrderedList.size(list1);
		while (size2 != 0) {
			OrderedList.addAtlist3(list3, curr1.data);
			curr1 = curr1.next;
			OrderedList.addAtlist3(list3, curr2.data);
			curr2 = curr2.next;
			size2--;
		}
		while (curr2 != null) {
			OrderedList.addAtlist3(list3, curr2.data);
			curr2 = curr2.next;
		}
	}

	/**
	 * @Purpose : method to insert the value into third Linked List.
	 * @param list -> it pass the third Linked List.
	 * @param data -> it pass value form two list one by one.
	 */
	public static void addAtlist3(OrderedList list3, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list3.head == null) {
			list3.head = newNode;
		} else {
			Node last = list3.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		System.out.print("This is linked list 3\n");
		Utility.printlist(list3);
	}
}
