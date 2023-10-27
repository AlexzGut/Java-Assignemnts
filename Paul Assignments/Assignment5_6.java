package com.lcit.assignment56;

import java.util.Random;
import java.util.Scanner;

public class Assignment5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userSelection = new Scanner(System.in);

		int user_number;

		System.out.println("Enter 1 for Assignment 5 - Coin Toss Simulator");
		System.out.println("Enter 2 for Assignment 6 - Store Sales Bar Chart");
		System.out.print("Please choose which program to run (1 or 2): ");

		user_number = userSelection.nextInt();

		if (user_number == 1) {
			System.out.println("");
			assignment5();
		}

		else if (user_number == 2) {
			System.out.println("");
			assignment6();
		}

		else {
			System.out.println("Invalid input. Please try again");
		}

	}

	public static void assignment5() {

//		Coin Toss Simulator
//		Write a class named Coin. The Coin class should have the following field:
//
//		• A String named sideUp. The sideUp field will hold either “heads” or “tails” 
//		indicating the side of the coin that is facing up.
//
//		The Coin class should have the following methods:
//
//		• A no-arg constructor that randomly determines the side of the coin that is facing up 
//		(“heads” or “tails”) and initializes the sideUp field accordingly.
//
//		• A void method named toss that simulates the tossing of the coin. 
//		When the toss method is called, it randomly determines the side of the coin 
//		that is facing up (“heads” or “tails”) and sets the sideUp field accordingly.
//
//		• A method named getSideUp that returns the value of the sideUp field.
//
//		Write a program that demonstrates the Coin class. 
//		The program should create an instance of the class and display the side 
//		that is initially facing up. Then, use a loop to toss the coin 20 times. 
//		Each time the coin is tossed, display the side that is facing up. The program should
//		keep count of the number of times heads is facing up and the number of times 
//		tails is facing up, and display those values after the loop finishes.

		System.out.println("Welcome to the Coin Toss Simulator!");
		System.out.println();

		class Coin {
			private String sideUp;

			public Coin() {
				toss(); // Initialize sideUp by calling toss()
			}

			public void toss() { // Method to simulate tossing the coin
				Random rand = new Random();
				int randomNum = rand.nextInt(2); // Generate a random number (0 or 1)
				if (randomNum == 0) {
					sideUp = "heads";
				} else {
					sideUp = "tails";
				}
			}

			public String getSideUp() { // Method to get the value of sideUp
				return sideUp;
			}
		}

		Coin myCoin = new Coin(); // Create an instance of Coin

		// Display the side initially facing up as required
		System.out.println("Initially facing up: " + myCoin.getSideUp());

		// Toss the coin 20 times
		int headsCount = 0;
		int tailsCount = 0;
		for (int i = 0; i < 20; i++) {
			myCoin.toss(); // Toss the coin
			System.out.println("Toss " + (i + 1) + ": " + myCoin.getSideUp());

			// Update the counts
			if (myCoin.getSideUp().equals("heads")) {
				headsCount++;
			}

			else {
				tailsCount++;
			}
		}

		// Display the number of heads and tails
		System.out.println("\nHeads count: " + headsCount);
		System.out.println("Tails count: " + tailsCount);

	} // end of assignment5

	public static void assignment6() {

//		Write a program that asks the user to enter today’s sales for five stores. The program should
//		display a bar chart comparing each store’s sales. Create each bar in the bar chart by displaying
//		a row of asterisks. Each asterisk should represent $100 of sales. Here is an example of
//		the program’s output:
//		Enter today's sales for store 1: 1000 [Enter]
//		Enter today's sales for store 2: 1200 [Enter]
//		Enter today's sales for store 3: 1800 [Enter]
//		Enter today's sales for store 4: 800 [Enter]
//		Enter today's sales for store 5: 1900 [Enter]
//		SALES BAR CHART
//		Store 1: **********
//		Store 2: ************
//		Store 3: ******************
//		Store 4: ********
//		Store 5: *******************

		Scanner store = new Scanner(System.in);

		System.out.println("Welcome to the Store Sales Bar Chart Program! \n");

		double[] store_sales = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter today's sales for store " + (i + 1) + " : ");
			store_sales[i] = store.nextDouble();
		}

		System.out.println(" ---- SALES BAR CHART ---- ");

		for (int j = 0; j < store_sales.length; j++) {
			System.out.print("Store " + (j + 1) + ": ");
			for (int k = 0; k < store_sales[j] / 100; k++)
				System.out.print("*");
			System.out.println();

		}

	} // end of assignment6
}
