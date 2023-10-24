package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		double weightOfPackage = 0.0,
				shippingCharges = 0.0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the weight of the package: ");
		weightOfPackage = input.nextDouble();
		
		if (weightOfPackage > 10) {
			shippingCharges = 3.80;
		} else if (weightOfPackage > 6) {
			shippingCharges = 3.70;
		} else if (weightOfPackage > 2) {
			shippingCharges = 2.20;
		} else if (weightOfPackage > 0) {
			shippingCharges = 1.10;
		}
		
		System.out.printf("\n              Shipping charges            \n" +
						  "*******************************************\n" +
						  "Weight Of Package (lbs)    Shipping Charges\n" +
						  "-------------------------------------------\n" +
						  "%-26.2f $%.2f", weightOfPackage, shippingCharges);
		input.close();
	}

}
