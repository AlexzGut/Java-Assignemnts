package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		double weightOfPackage = 0.0,
			   shippingChargesPer500Miles = 0.0,
			   milesShipped = 0.0,
			   finalShippingCharges = 0.0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the weight of the package (lb): ");
		weightOfPackage = input.nextDouble();
		System.out.print("Enter the the distance for shipment (miles): ");
		milesShipped = input.nextDouble();
		
		while (weightOfPackage < 0) {
			System.out.println("Invalid weight!");
			System.out.print("Enter the weight of the package: ");
			weightOfPackage = input.nextDouble();
		}
		
		if (weightOfPackage > 10) {
			shippingChargesPer500Miles = 3.80;
		} else if (weightOfPackage > 6) {
			shippingChargesPer500Miles = 3.70;
		} else if (weightOfPackage > 2) {
			shippingChargesPer500Miles = 2.20;
		} else if (weightOfPackage >= 0) {
			shippingChargesPer500Miles = 1.10;
		} 
		
		finalShippingCharges = ((int) milesShipped / 500) * shippingChargesPer500Miles;
		
		
		System.out.printf("\n              Shipping charges            \n" +
						  "*******************************************\n" +
						  "Weight Of Package (lbs)    Shipping Charges\n" +
						  "-------------------------------------------\n" +
						  "%-26.2f $%.2f", weightOfPackage, finalShippingCharges);
		input.close();
	}

}
