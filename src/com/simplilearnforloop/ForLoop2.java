package com.simplilearnforloop;

public class ForLoop2 {

	public static void main(String[] args) {
		// Write a program to find total and average employee salary 

		double employeeSalary [] = {200_000, 250_000,300_000, 350_000,400_000};
		double sum = 0;
		for (int i=0; i<employeeSalary.length; i++) {
			sum = sum + employeeSalary[i];
       	}
		
		
		
		
		System.out.println("The total employee salaries is: " + sum);
		System.out.println("The average employee salary is: " + sum/employeeSalary.length);
	}

}
