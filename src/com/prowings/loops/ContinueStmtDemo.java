package com.prowings.loops;

public class ContinueStmtDemo {

	public static void main(String[] args) {

		System.out.println("Main Started");

		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println("i= " + i);
		}

		System.out.println("Main Ended");
	}
}
