package com.prowings.loops;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		incrementDemo();
		decrementDemo();
	}

	public static void incrementDemo() {
		
		System.out.println("Numbers from 1 to 10 :");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void decrementDemo() {

		System.out.println("Numbers from 10 to 1 :");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
