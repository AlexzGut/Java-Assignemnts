package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_1 {

	/**
	* Assignment 1:
	* This program prints a string in the console after taking 3 variables from the user: a String variable 
 	* is saved as the person's name, an int containing the person's age and finally, a double variable containing 
	* the expected salary. The output String is formatted using the printf method.
	* */
	
	public static void main(String[] args) {
		
		final String OUTPUT = "My name is %s, my age is %d, and I hope to earn $%,.2f per year";
		String name;
		int age;
		double annualPay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		System.out.print("Enter your desired annual income: ");
		annualPay = input.nextDouble();
		
		System.out.printf(OUTPUT, name, age, annualPay);
		
		input.close();
	}

}
