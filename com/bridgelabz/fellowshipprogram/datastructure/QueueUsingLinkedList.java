package com.bridgelabz.fellowshipprogram.datastructure;

/**
 * @author Tejashree Surve
 * @Purpose : Queue sing Linked List Logic.
 */

public class QueueUsingLinkedList<T> {
	public class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node<T> front, rare;

	public QueueUsingLinkedList() {
		this.front = null;
		this.rare = null;
	}

	/**
	 * @Purpose : add value into Linked List.
	 * @param <T>
	 */
	public void enqueue(T valueToList) {
		Node<T> node = new Node(valueToList);
		if (this.rare == null) {
			this.front = node;
			this.rare = node;
		} else {
			this.rare.next = node;
			this.rare = this.rare.next;
		}
	}

	/**
	 * @Purpose : remove value form Linked List.
	 * @param <T>
	 */
	public T dequeue() {
		Node<T> currNode;
		if (isEmpty())
			return null;

		T deletedNode = (T) this.front.data;
		currNode = this.front;
		this.front = currNode.next;

		if (this.front == null)
			this.rare = null;

		return deletedNode;
	}

	/**
	 * @Purpose : check whether Linked List is empty or not.
	 * @return : boolean value.
	 */
	public boolean isEmpty() {
		if (this.front == null)
			return true;
		else
			return false;
	}

	/**
	 * @Purpose : print value of Linked List.
	 */
	public void printQueueLinkedList() {
		while (this.front != null) {
			System.out.println(this.front.data + " ");
			this.front = this.front.next;
		}
	}
}
