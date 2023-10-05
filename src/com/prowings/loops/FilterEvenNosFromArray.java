package com.prowings.loops;

import java.util.Arrays;

public class FilterEvenNosFromArray {

	public static void main(String[] args) {

		int[] numbers = {12, 5, 34, 2, 4, 7, 10, 6, 80, 22};

		int[] result = filterTheEvenNumber(numbers);
		
		System.out.println("Filtered even numbers are: " + Arrays.toString(result));

	}

	public static int[] filterTheEvenNumber(int[] numbers) {

		System.out.println("Input array elements are: " + Arrays.toString(numbers));

		int counter = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				counter++;
			}
		}

		int[] result = new int[counter];
		int anotherCounter = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				result[anotherCounter] = numbers[i];
				anotherCounter++;
			}
		}
		return result;
	}
}
