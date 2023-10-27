// Author: Paul Untalan c0899319

package com.lcit.assignment12;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program that declares the following: 
//			• a String variable named name
//			 • an int variable named age 
//			• a double variable named annualPay
//
//			Use the Scanner class to take the user input for these variables and
//			store your age, name, and desired annual income as literals in these variables. 
//
//			The program should display these values on the screen in a manner similar to the following: 
//			My name is Joe Mahoney, my age is 26 and I hope to earn $100000.0 per year.
		
		
		int age;
		String name = null;
		Double annualPay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		
		System.out.print("Please enter your age: ");
		age = sc.nextInt();
		sc.nextLine(); // use space
		
		System.out.print("Please enter your desired Annual Pay: ");
		annualPay = sc.nextDouble();
		
		System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + 
		annualPay + " per year." );
		
		
		

	}

}
