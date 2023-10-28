package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_6 {

	/**
	 * The Sales Bar Chart program takes 5 number inputs from the user. Each input
	 * corresponds to the total sales of each store.
	 * 
	 * The output will show a horizontal graph showing "*", which denotes the total
	 * sales of each store. Each asterisk "*" denotes a sales of $100.
	 * 
	 * As an example, if Store 1 has $600 Total Sales, the graph should show:
	 * 
	 * Store 1: ****** ($600 = 6 asterisks)
	 * 
	 * There are two approaches to produce the asterisks. Please see the single line
	 * comments in the source code.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double AmountOfSales;
		String barChart = "\n------- SALES BAR CHART -------\n";
//		String chart = "";

		for (int i = 1; i <= 5; i++) {
			System.out.printf("Enter today's sales for store %d: ", i);
			AmountOfSales = input.nextDouble();

			// first approach. using the repeat() method:
			barChart += String.format("Store %d: %s\n", i, "*".repeat((int) AmountOfSales / 100));

//			Another approach using a nested for loop:

//			for (int j = 0; j < (AmountOfSales / 100); j++) {
//				chart += "*";
//			}
//			barChart += String.format("Store %d: %s\n", i, chart);			
//			chart = "";
		}

		System.out.println(barChart);
		input.close();
	}

}
