package com.lcit.assignment34;

import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userSelection = new Scanner(System.in);
		
		int user_number;
		
		System.out.println("Enter 1 for Assignment 3 - Grocery Store");
		System.out.println("Enter 2 for Assignment 4 - Freight Shipping Company");
		System.out.print("Please choose which program to run (1 or 2): ");
		
		user_number = userSelection.nextInt();
		
		if (user_number == 1) {
			System.out.println("");
			assignment3();
		}
		
		else if (user_number == 2) {
			System.out.println("");
			assignment4();
		}
		
		else {
			System.out.println("Invalid input. Please try again");
		}

	}
	
	
	public static void assignment3() {
		
//		Write a program that will ask the user to enter the name and number of 
//		Items or quantity of a purchase On a grocery store.
		
//		The user is supposed to purchase at lease 5 items.
		
//		User should be asked repeatedly to enter the name of Item and quantity or number of items needed 
//		until the user selects to exit.
		
//		The program should then compute the state and county sales tax on each item. 
//		Your Program should display the Item name ,price ,state sales tax ,country sales tax 
//		and Final Price including taxes  after each Item purchase.
//
//		In the End
//		The program should display the amount of the total purchase, the state sales tax, 
//		the county sales tax, the total sales tax, and the total of the sale 
//		(which is the sum of the amount of purchase plus the total sales tax).
		
//		Note: For User Input Use Scanner Class or JOptionPane .
		
		try (Scanner order = new Scanner(System.in)) {
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // converts the amount to proper format
			
			System.out.println("Welcome to the Grocery Store Program !!!");
			System.out.print("Please Enter the Number of Items to Calculate the Prices : ");
			
			int items_count = order.nextInt();
			
			if (items_count >= 5) {		
			
				System.out.println("Number of Items to Purchase : " +items_count +"\n");
				order.nextLine();
				
				String[] item_name = new String[items_count]; // array that holds the item names
				double[] item_price = new double[items_count]; // array that holds the item prices
				final double gst = 0.05; // goods and services tax 5%
				final double rst = 0.08; // retail sales tax rate 8%
				double[] gst_cost = new double[items_count]; // array to hold the GST of each item.
				double[] rst_cost = new double[items_count]; // array to hold the RST of each item.
				double[] sales_tax = new double[items_count]; // array to hold the total sales tax of each item
				double[] final_price = new double[items_count]; // array to hold the final price of the item (price + tax)
				
				for (int i = 0; i < item_name.length;  i++) {
					
					
					System.out.print("Enter the Item Name : ");
					item_name[i] = order.nextLine();
					
					System.out.print("Enter the Price : ");
					item_price[i] = order.nextDouble();
					order.nextLine();
					
					System.out.println(""); // space
					
					gst_cost[i] = item_price[i] * gst;
					rst_cost[i] = item_price[i] * rst;
					sales_tax[i] = (gst_cost[i] + rst_cost[i]);
					final_price[i] = (sales_tax[i] + item_price[i]);			
				}	
				
				System.out.println("***** Grocery Items List with Price ***** \n");
					
				for (int j = 0; j < item_name.length; j++) {

					System.out.println("Item #: "+(j+1));
					System.out.println("Product Name : \t\t"+item_name[j]);
					System.out.println("Regular Price : \t"+ currencyFormat.format(item_price[j]));
					System.out.println("GST : \t\t\t"+ currencyFormat.format(gst_cost[j]));
					System.out.println("RST : \t\t\t"+ currencyFormat.format(rst_cost[j]));
					System.out.println("Total Item Tax : \t"+ currencyFormat.format(sales_tax[j]));
					System.out.println("Item Final Price : \t"+ currencyFormat.format(final_price[j]));
					System.out.println("--------------------------------------\n");
								
				}
				
				double total_price = 0; // total price calculation
				double total_gst = 0; // total GST calculation
				double total_rst = 0; // total RST calculation
				double total_sales_tax = 0; // total sales tax calculation
				double total_sale_price = 0; // final cost of purchased goods including tax
				
				
				for (int x = 0; x < item_name.length; x++) {
					
					total_price += item_price[x];
					total_gst += gst_cost[x];
					total_rst += rst_cost[x];
					total_sales_tax += sales_tax[x];
								
				}

					total_sale_price = total_price + total_sales_tax;
				
					
// 			Display the amount of the total purchase, the state sales tax(GST), the county sales tax(RST), 
//			the total sales tax, and the total of the sale 
//			(which is the sum of the amount of purchase plus the total sales tax).	
					
				System.out.println("\n\n-------------------------------------");
				System.out.println("Total Price of items purchased : \t" + currencyFormat.format(total_price));
				System.out.println("Total GST : \t\t\t\t" + currencyFormat.format(total_gst));
				System.out.println("Total RST : \t\t\t\t" + currencyFormat.format(total_rst));
				System.out.println("Total Sales Tax : \t\t\t" + (currencyFormat.format(total_sales_tax)) + "\n");
				System.out.println("Total of the Sale : \t\t\t" + currencyFormat.format(total_sale_price));
				
				System.out.println("\nThank you for your patronage. See you again!");
			}
			
			else {
				System.out.println("\nError!!!");
				System.out.println("You need to purchase a minimum of 5 items.");
				System.out.println("Please try again.");
			}
		}

	} // end of assignment3 program
	
	public static void assignment4() {
		
//		The Fast Freight Shipping Company charges the following rates: 
//		Weight of Package Rate per 500 Miles Shipped 
//		•	2 pounds or less $1.10 
//		•	Over 2 pounds but not more than 6 pounds $2.20 
//		•	Over 6 pounds but not more than 10 pounds $3.70 
//		•	Over 10 pounds $3.80 
		
//		The shipping charges per 500 miles are not pro-rated. 
//		For example, if a 2-pound package is shipped 550 miles, 
//		the charges would be $2.20. Write a program that asks the user 
//		to enter the weight of a package and then displays the shipping charges.

		try (Scanner freight = new Scanner(System.in)) {
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // converts the amount to proper format
			
			System.out.println("Welcome to the Fast Freight Shipping Calculator!");
			System.out.print("\nPlease Enter the weight of your package in pounds (lbs) : ");
			double package_weight = freight.nextDouble();
			double package_cost = 0.00;
			int delivery_distance = 0; // distance in miles
			double delivery_cost = 0.00; // package delivery cost per 500 miles. not pro-rated.
			
			if (package_weight > 10.00) {
				package_cost = 3.80;
			}
			
			else if (package_weight > 6.00) {
				package_cost = 3.70;
			}
			
			else if (package_weight > 2.00) {
				package_cost = 2.20;
			}
			
			else if (package_weight < 2.00 && package_weight > 0) {
				package_cost = 1.10;
			}
			else {
				System.out.println("Error!!!");
				System.out.println("Package weight should be more than 0 pounds.");
				System.out.println("Please try again.");
			}
			
			System.out.print("Please Enter the delivery distance in miles: ");
			delivery_distance = freight.nextInt();
			
			if (delivery_distance > 0) {
				int increments = (delivery_distance / 500) + (delivery_distance % 500 != 0 ? 1 : 0); // computes the multiplier if the distance is more than 500 miles.
				
				delivery_cost = increments * package_cost;
	
				
				System.out.println();
				System.out.println("-----------------------------------------------------------");
				System.out.println("Your package weight is: \t\t" + package_weight + " lbs");
				System.out.println("The shipping cost per 500 miles is: \t" + (currencyFormat.format(package_cost)));
				System.out.println("The destination is \t\t\t" + delivery_distance + " mile(s)");
				System.out.println();
				System.out.println("The total delivery cost is : \t\t" + (currencyFormat.format(package_cost*increments)));
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
			
		}		
		
	} // end of assignment4 program

}
