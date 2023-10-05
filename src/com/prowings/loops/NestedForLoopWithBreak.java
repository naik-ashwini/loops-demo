package com.prowings.loops;

public class NestedForLoopWithBreak {

	public static void main(String[] args) {
		System.out.println("Main Started");

		outer:
		for (int i = 0; i < 5; i++) {
			System.out.println("i= " + i);

			for (int j = 0; j < 3; j++) {
				if (i == 3) {
					break outer;
				}
				System.out.println("j= " + j);
			}
		}
		System.out.println("Main Ended");
	}
}
