package com.bridgelabz.fellowshipprogram.datastructure;

/**
 * @author Tejashree Surve
 * @Purpose : UorderedList logic.
 */
public class UnOrderedList {
	Node head;

	public static class Node {
		String data;
		Node next;

		Node(String str) {
			data = str;
			next = null;
		}
	}

	/**
	 * @Purpose : method insert a node at the end of Linked List
	 * @param list-> input link list
	 * @param data-> data of the new node that needs to be added
	 * @return list-> modified list
	 */
	public static UnOrderedList insertAtEnd(UnOrderedList list, String data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	/**
	 * @Purpose : method to pop value form Linked List
	 * @param list-> input link list
	 * @param data-> data of the new node that needs to be added
	 */
	public static UnOrderedList pop(UnOrderedList list, String string) {
		Node currnode = list.head;
		Node prev = null;
		if ((currnode != null) && ((currnode.data).equals(string))) {
			list.head = currnode.next;
			System.out.println("Value is been deleted");
		}
		while ((currnode != null) && (!(currnode.data).equals(string))) {
			prev = currnode;
			currnode = currnode.next;
		}
		if (currnode != null) {
			prev.next = currnode.next;
			System.out.println("Value is been deleted\n");
		}
		if (currnode == null) {
			System.out.println("value not found\n");
			list = insertAtEnd(list, string);
		}
		return list;
	}
}
