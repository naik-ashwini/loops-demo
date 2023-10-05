package com.prowings.loops;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		//normal for loop
		
		for(int i=0; i<5; i++) {	
			System.out.println(nums[i]);
		}
		
	System.out.println("*************************************");
	
		//for each loop
		
		for(int n : nums) {			
			System.out.println(n);
		}
	}
}
