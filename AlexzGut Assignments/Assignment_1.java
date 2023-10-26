package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_1 {

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
