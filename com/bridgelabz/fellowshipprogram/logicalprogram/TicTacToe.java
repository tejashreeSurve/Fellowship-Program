package com.bridgelabz.fellowshipprogram.logicalprogram;

import java.util.*;
/**
 * @author Tejashree Surve
 * @Purpose : Tictactoe.
 */
public class TicTacToe {

	static char[][] printtable(char[][] arr) { // this function will just print the array in 3d grid form
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " | ");
			}
			System.out.println();
		}
		return arr; // and return the arr
	}

	static boolean check(char[][] arr, int option, int player) {

		int key = option;
		int a = player;
		boolean status;
		switch (key) { // this switch option to change the value of arr as per option
		case 0:
			if (arr[0][0] == '-') {
				if (a == 10) {
					arr[0][0] = 'x';
					arr = printtable(arr); // the arr is return to check if arr or index of the array are filled with
											// triple x or triple o and to print whether computer won of you won
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[0][0] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 1:
			if (arr[0][1] == '-') {
				if (a == 10) {
					arr[0][1] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[0][1] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 2:
			if (arr[0][2] == '-') {
				if (a == 10) {
					arr[0][2] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[0][2] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 3:
			if (arr[1][0] == '-') {
				if (a == 10) {
					arr[1][0] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[1][0] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 4:
			if (arr[1][1] == '-') {
				if (a == 10) {
					arr[1][1] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[1][1] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 5:
			if (arr[1][2] == '-') {
				if (a == 10) {
					arr[1][2] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[1][2] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;
		case 6:
			if (arr[2][0] == '-') {
				if (a == 10) {
					arr[2][0] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[2][0] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 7:
			if (arr[2][1] == '-') {
				if (a == 10) {
					arr[2][1] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[2][1] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		case 8:
			if (arr[2][2] == '-') {
				if (a == 10) {
					arr[2][2] = 'x';
					arr = printtable(arr);
					if ((arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
							|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
							|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
							|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
							|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x'))
						System.out.println("computer win");
				} else {
					arr[2][2] = 'o';
					arr = printtable(arr);
					if ((arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
							|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
							|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
							|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
							|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o'))
						System.out.println("you win");
				}
			} else {
				System.out.println("this is been filled please enter other option ");
			}
			break;

		default:
			System.out.println("please enter valide option \n");
			break;
		}
		if ((arr[0][0] != '-' && arr[0][1] != '-' && arr[0][2] != '-' && arr[1][0] != '-' && arr[1][1] != '-'
				&& arr[1][2] != '-' && arr[2][0] != '-' && arr[2][1] != '-' && arr[2][2] != '-')
				|| (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x')
				|| (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o')
				|| (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x')
				|| (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o')
				|| (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x')
				|| (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o')
				|| (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x')
				|| (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o')
				|| (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x')
				|| (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o')
				|| (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x')
				|| (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o')
				|| (arr[0][2] == 'x' && arr[1][1] == 'x' && arr[2][0] == 'x')
				|| (arr[0][2] == 'o' && arr[1][1] == 'o' && arr[2][0] == 'o')) {
			status = false;
			return status;
		} else {
			status = true;
			return status;
		}
	}

	public static void main(String args[]) {

		int option = 0;
		int player = 10, player2 = 11; // for player =10 its an computer of for palyer2=11 its an you
		boolean status = true; // this is an boolean variable to stop the while loop
		char[][] arr = new char[3][3];
		Set<Integer> set = new HashSet<Integer>();// set is use for keeping the track of random function and option
													// taken from user
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("WELCOME TO TIC-TAC-TOE");
		System.out.println("PLAYER1-COMPUTER\n ");
		System.out.println("PLAYER2-USER\n");
		System.out.println("IN FORMAT\n");
		System.out.println("0 | 1 | 2 |");
		System.out.println("3 | 4 | 5 |");
		System.out.println("6 | 7 | 8 |");
		arr[0][1] = '-';
		arr[0][0] = '-';
		arr[0][2] = '-';
		arr[1][0] = '-';
		arr[1][1] = '-';
		arr[1][2] = '-';
		arr[2][0] = '-';
		arr[2][1] = '-';
		arr[2][2] = '-';
		while (status != false) {
			System.out.println("player1-computer");
			while (set.contains(option)) {
				option = r.nextInt(9);
			}
			set.add(option);
			System.out.println(set);
			status = check(arr, option, player);
			if (status == false)
				break;
			System.out.println("player1-you");
			System.out.println("enter option");
			option = scanner.nextInt();
			set.add(option);
			status = check(arr, option, player2);
			scanner.close();
		}
	}
}
