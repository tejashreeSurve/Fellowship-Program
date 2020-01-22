package com.bridgelabz.fellowshipprogram.datastructure;

/**
 * @author Tejashree Surve
 * @Purpose : Stack logic.
 */
public class Stack {
	int top = -1;
	char check[] = new char[100];

	/**
	 * @Purpose : push any type of element into stack.
	 * @param --> method pass char or any type object.
	 */
	void push(char x) {
		if (top == 99) {
			System.out.println("Stack is full\n");

		} else {
			check[++top] = x;
		}
	}

	/**
	 * @Purpose : pop the first element of stack array
	 */
	char pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return '\0';
		} else {
			char element = check[top];
			top--;
			return element;
		}
	}

	/**
	 * @Purpose : passes the top element of stack array
	 */
	char peak() {
		if (top == -1) {
			return '\0';
		} else {
			char element = check[top];
			return element;
		}
	}

	/**
	 * @Purpose : check whether the stack is empty or not
	 */
	boolean isempty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
}
