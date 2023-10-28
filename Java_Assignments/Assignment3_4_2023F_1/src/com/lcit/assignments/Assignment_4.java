package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_4 {

	/**
	 * This Freight Shipping Calculator will be taking the user's input for their package weight (in pounds or lbs)
	 * and the distance of the delivery destination (in miles).
	 * 
	 * Based on the weight of the package a fixed package cost will be designated.
	 * 
	 * The total cost of the delivery will be determined by a multiplier or increment which is equal to
	 * the number of times the delivery destination exceeds 500 miles. 
	 * 
	 * As an example, If the package weight is less than 2.00 pounds, the package cost will be $ 1.10.
	 * If the delivery distance is 501 miles, the increment will be 2 because it already exceeded the 500 mile
	 * threshold. If the distance was 1001 miles, then the increment will be 3.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Welcome to the Fast Freight Shipping Calculator!");
		System.out.print("\nPlease Enter the weight of your package in pounds (lbs): ");
		double packageWeight = input.nextDouble();
		double packageCost = 0.0;
		double deliveryDistance = 0.0; // distance in miles
		double deliveryCost = 0.0; // package delivery cost per 500 miles. not pro-rated.
		final String OUTPUT_CURRENCY = "%-30s $%.2f\n",
					 OUTPUT_UNITS = "%-30s %.2f\n";
		
		if (packageWeight > 10.00) {
			packageCost = 3.80;
		}
		
		else if (packageWeight > 6.00) {
			packageCost = 3.70;
		}
		
		else if (packageWeight > 2.00) {
			packageCost = 2.20;
		}
		
		else if (packageWeight <= 2.00 && packageWeight > 0) {
			packageCost = 1.10;
		}
		else {
			System.out.println("Error!!!");
			System.out.println("Package weight should be more than 0 pounds.");
			System.out.println("Please try again.");
		}
		
		System.out.print("Please Enter the delivery distance in miles: ");
		deliveryDistance = input.nextInt();
		
		if (deliveryDistance > 0) {
			deliveryCost = (((int) deliveryDistance / 500) + (deliveryDistance % 500 != 0 ? 1 : 0)) * packageCost; // computes the multiplier if the distance is more than 500 miles.
			
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			System.out.printf(OUTPUT_UNITS, "Package weight (lbs): ", packageWeight);
			System.out.printf(OUTPUT_CURRENCY, "Shipping cost per 500 miles: ", packageCost);
			System.out.printf(OUTPUT_UNITS, "Distance (miles):", deliveryDistance);
			System.out.println();
			System.out.printf(OUTPUT_CURRENCY, "Total delivery cost: ", deliveryCost);
			System.out.println();
			System.out.println("Please contact our sales team if you would like to proceed with this delivery.");
			System.out.println("Thank you for choosing Fast Freight Shipping Company");
			System.out.println("See you again!");

		}
		else {
			System.out.println("Error!!!");
			System.out.println("Distance should be more than zero (0)");
			System.out.println("Please try again.");
		}
		
		input.close();
	}

}
