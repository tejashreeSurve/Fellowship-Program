package com.bridgelabz.fellowshipprogram.datastructure;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To check whether string contains balanced parentheses.
 */
public class Parentheses {
	static boolean isparentheses(char exp[]) {
		Stack stack = new Stack();
		char element1, element2;
		for (int i = 0; i < exp.length; i++) {
			if ((exp[i] == '(') || (exp[i] == '{') || (exp[i] == '['))
				stack.push(exp[i]);
			if ((exp[i] == ')') || (exp[i] == '}') || (exp[i] == ']')) { // if its contain close parentheses then pop
				if (stack.isempty())
					return false;
				else
					element1 = stack.pop();
				element2 = stack.peak();
				if (((element1 == '(') && (element2 == ')')) || ((element1 == '{') && (element2 == '}'))
						|| ((element1 == '[') && (element2 == ']')))
					return true;
			}
		}
		if (stack.isempty())
			return true;
		else
			return false;
	}

	public static void main(String args[]) throws IOException {
		String string;
		System.out.println("Enter the expresion");
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		char[] charArray = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			charArray[i] = string.charAt(i);
		}
		if (isparentheses(charArray)) {
			System.out.println("balance");
		} else {
			System.out.println("unbalance");
		}
		scanner.close();
	}
}
