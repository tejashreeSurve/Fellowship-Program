package com.bridgelabz.fellowshipprogram.datastructure;

import java.util.Scanner;

/**
 * @author Tejashree Surve
 * @Purpose : To find n number of Binary Trees.
 */
public class NumberOfBinaryTree<T> {
	void binaryTreeMethod(int number) {
		long[] G = new long[number + 1];
		G[0] = 1; // number of trees for 0 node
		G[1] = 1; // number of trees for 1 node
		for (int i = 2; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				G[i] += G[j - 1] * G[i - j];
			}
		}
		System.out.println(G[number]);
	}

	public static void main(String[] args) {
		NumberOfBinaryTree<Integer> binaryTree = new NumberOfBinaryTree<Integer>();
		System.out.println("Enter the number of element\n");
		Scanner scanner = new Scanner(System.in);
		int numberOfElement = scanner.nextInt();
		int[] numberOfTestCase = new int[numberOfElement];
		for (int i = 0; i < numberOfElement; i++) {
			numberOfTestCase[i] = scanner.nextInt();
		}
		System.out.println("This is number Of trees\n");
		for (int i = 0; i < numberOfElement; i++) {
			binaryTree.binaryTreeMethod(numberOfTestCase[i]); // pass the numbers of nodes.
		}
		scanner.close();
	}
}
