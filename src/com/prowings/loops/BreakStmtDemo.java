package com.prowings.loops;

import java.util.Scanner;

public class BreakStmtDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;

		for (;;) {

			System.out.println("Please enter number to add: ");
			input = sc.nextInt();

			if (input < 0) {
				break;
			}
			sum += input;

			System.out.println("sum is: " + sum);
		}
	}
}
