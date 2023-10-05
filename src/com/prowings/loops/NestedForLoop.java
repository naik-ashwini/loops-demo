package com.prowings.loops;

public class NestedForLoop {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		for(int i=0; i<5; i++) {
			System.out.println("i= "+i);
			
			for(int j=0; j<3; j++) {
				System.out.println("j= "+j);		
			}
		}
		System.out.println("Main Ended");
	}
}
