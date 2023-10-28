package com.lcit.assignments;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double AmountOfSales;
		String barChart = "\n------- SALES BAR CHART -------\n";
//		String chart = "";
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Enter today's sales for store %d: ", i);
			AmountOfSales = input.nextDouble();
			barChart += String.format("Store %d: %s\n", i, "*".repeat( (int) AmountOfSales / 100));
			
//			Another approach
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