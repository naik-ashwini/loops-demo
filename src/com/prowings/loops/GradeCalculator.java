package com.prowings.loops;

public class GradeCalculator {

	
	public static void main(String[] args) {
	
		int[] marks = {4,4,36,4,44,40};
		
		String grade = calculateGrade(marks);
		System.out.println("Grade is : "+grade);
	}
	
	

	public static String calculateGrade(int[] marks) {
		
		int avg = 0;
		int sum = 0;
		
		for(int m : marks) {
			
			sum += m;      //sum = sum+marks
			
			avg = sum/marks.length;			
		}
		
		if(avg >=10 && avg <= 20) {
			return "D grade";
		}
		
		else if(avg >=21 && avg <= 30) {
			return "C grade";		
		}
		
		else if(avg >=31 && avg <= 40) {
			return "B grade";		
		}

		else if(avg >=41 && avg <= 50) {
			return "A grade";		
		}

		else
			return "Invalid grade";
	} 
	
}
