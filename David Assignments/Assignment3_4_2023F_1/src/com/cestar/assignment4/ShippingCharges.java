package com.cestar.assignment4;

import java.util.Scanner;

public class ShippingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Shipping Charges Program");
		System.out.print("Please enter the package's weight [pounds]: ");
		float pounds = sc.nextFloat();
		System.out.print("Please enter the distance shipped [miles]: ");
		float distance = sc.nextFloat();
		float rate;
		float cost;
		
		if (pounds <= 2) {
			rate = 1.10f;
		} else if (pounds <= 6) {
			rate = 2.20f;
		} else if (pounds <= 10) {
			rate = 3.70f;
		} else if (pounds > 10) {
			rate = 3.80f;
		} else {
			rate = 0;
		}
		
		cost = ((distance - distance%500)/500 + 1) * rate;
		System.out.println(String.format("The total cost is: $ %.2f", cost));
		
	}

}
