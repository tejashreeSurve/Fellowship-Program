package com.bridgelabz.fellowshipprogram.basiccoreprogram;

import java.util.*;

/**
 * @author Tejashree Surve
 * @Purpose : To find percent of number of head and tails occur.
 */
public class FlipCoin {
	public static void main(String args[]) {
		int heads = 0;
		int tails = 0;
		double randomnum = 0.0;
		int count = 1;
		System.out.println("enter the number of times to flip the coin\n");
		int flip;
		Scanner scanner = new Scanner(System.in);
		flip = scanner.nextInt();
		while (count <= flip) {
			randomnum = Math.random();
			if (randomnum < 0.5) {
				tails++;
			} else {
				heads++;
			}
			count++;
		}
		System.out.println("percentage of head: " + (heads / 100));
		System.out.println("no.of heads: " + heads + "\n" + "no.of tails: " + tails);
		if (heads != 0 && tails != 0)
			System.out.println("Percentage of heads vs tails:" + (heads / tails) * 100);
		scanner.close();
	}

}
