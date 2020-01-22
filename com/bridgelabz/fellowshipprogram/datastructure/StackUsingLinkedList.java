package com.bridgelabz.fellowshipprogram.datastructure;

/**
 * @author Tejashree Surve
 * @Purpose : Stack using Linked List logic.
 */
public class StackUsingLinkedList<T> {

	public class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node<T> top = null;

	public StackUsingLinkedList() {
		this.top = null;

	}

	/**
	 * @Purpose : push any type of element into Linked List.
	 * @param --> method pass char or any type object.
	 */
	public void push(T valueToList) {
		Node<T> node = new Node(valueToList);
		node.next = top;
		this.top = node;
	}

	/**
	 * @Purpose : pop the first element of stack array
	 */
	T pop() {
		T value;

		if (isempty()) {

			return null;
		} else {
			value = (T) this.top.data;
			this.top = this.top.next;

			return value;
		}
	}

	/**
	 * @Purpose : check whether the stack is empty or not
	 */
	boolean isempty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @Purpose : print Linked List.
	 */
	public void printStack() {
		if (isempty())
			System.out.println("stack is empty\n");
		else {
			Node<T> currNode = top;
			while (currNode != null) {
				System.out.println(currNode.data);
				currNode = currNode.next;
			}
		}
	}
}
