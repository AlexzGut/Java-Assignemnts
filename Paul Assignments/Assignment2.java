package com.lcit.assignment12;

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Create a program to calculate pay
//		1.	Will has asked that you create a Pay Calculator program, with the following
//		variables at minimum, you can add more variables if needed.
//
//		Components
//		a.	HoursWorked
//		b.	PayRate
//		c.	BonusPercentage
//		d.	TaxPercentage
//		e.	BonusHours
//		f.	finalPay
//		g.	dialog box - input
//		h.	dialog box - output
//
//		Functionality
//
//		The program will ask for hours worked, bonus hours, then calculates Will’s final pay 
//		a.	Print Will’s final pay
		
		System.out.println("Welcome to the Pay Calculator Program!");
		
		float hoursWorked; // hours worked can be a decimal number.
		float payRate = 16.5f; // set to 16.5 CAD per hour rate.
		float bonusPercentage = 1.5f; // set to 1.5 multiplier.
		float taxPercentage = 0.13f; // set to current 13% tax rate.
		float bonusHours; // overtime work
		float totalPay, bonusPay, regularPay, totalTax, finalPay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your regular hours worked: ");
		hoursWorked = sc.nextFloat();
		
		System.out.print("Please enter your overtime hours:  ");
		bonusHours = sc.nextFloat();
		
		System.out.println("\n");
		
		// compute the pay:
		regularPay = hoursWorked * payRate;
		bonusPay = (bonusHours * bonusPercentage * payRate);
		totalPay = bonusPay + regularPay; 
		totalTax = totalPay * taxPercentage;
		finalPay = totalPay + totalTax;
		
		// change the output format to currency for the payment
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		
		String regularPayFormatted = currencyFormat.format(regularPay);
		String bonusPayFormatted = currencyFormat.format(bonusPay);
		String totalPayFormatted = currencyFormat.format(totalPay); 
		String totalTaxFormatted = currencyFormat.format(totalTax);
		String finalPayFormatted = currencyFormat.format(finalPay);
		
		// Show the output:
		
		System.out.println("Employee Name: \tWill");
		System.out.println("Pay Rate: \t$16.50 per hour");
		System.out.println("\nYou worked " + hoursWorked + " hour(s) this cut-off.");
		System.out.println("Also, you had " + bonusHours + " hour(s) of overtime in this pay period.");
		System.out.println("-----------------------------------------------------");
		System.out.println("         ******* Salary Breakdown *******");
		System.out.println("-----------------------------------------------------\n");
		System.out.println("Regular Work Salary: \t" + regularPayFormatted);
		System.out.println("Overtime Work Salary: \t" + bonusPayFormatted);
		System.out.println("Gross Pay: \t\t" + totalPayFormatted);
		System.out.println("Tax: \t\t\t" + totalTaxFormatted + "\n");		
		System.out.println("Total Net Pay: \t\t" + finalPayFormatted);

	}

}
