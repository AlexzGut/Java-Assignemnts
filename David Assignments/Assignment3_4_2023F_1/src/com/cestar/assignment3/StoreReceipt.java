package com.cestar.assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreReceipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("Grocery_receipt.txt");
			float TAX = 0f;
			System.out.println("Welcome to your store!");
			int i = 0;
			String itemName;
			float itemPrice;
			String itemLine;
			int stopAdding = 1;
			float subtotal;
			float total = 0;
			while (TAX == 0) {
				System.out.print("Select your state [press H for help]: ");
				String STATE = sc.nextLine();
				switch (STATE.toUpperCase()) {
				case "ON":
					TAX = 0.13f;
					break;
				case "AB": case "BC": case "MB": case "NT":
				case "NU": case "QC": case "SK": case "YT":
					TAX = 0.05f;
					break;
				case "NB": case "NL": case "NS": case "PE":
					TAX = 0.15f;
					break;
				case "H":
					System.out.println("State Codes:\nAB = Alberta\nBC = British Columbia\nMB = Manitoba\nNT = Northwest Territories\n"+
										"NU = Nunavut\nQC = Quebec\nSK = Saskatchewan\nYT = Yukon\nON = Ontario\n" + 
										"NB = New Brunswick\nNL = Newfoundland and Labrador\nNS = New Scotia\nPE = Prince Edward Island");
					continue;
				default:
					System.out.println("Please insert a valid state code.");
					continue;
				}
				
				while (stopAdding != 0) {
					System.out.print(String.format("Please enter the name for the item %o: ", i + 1));
					itemName = sc.nextLine();
					System.out.print(String.format("Please enter the price for the item %o: ", i + 1));
					itemPrice = sc.nextFloat();
					sc.nextLine();
					subtotal = itemPrice*(1+TAX);
					total = total + subtotal;
					itemLine = String.format("%15s |  $ %8.2f |  $ %8.2f |  $ %9.2f\n", itemName, itemPrice, itemPrice*TAX, subtotal);
					fw.write(itemLine);
					i++;
					if (i >= 5) {
						System.out.print("Press 0 to exit, any other number to continue: ");
						stopAdding = sc.nextInt();
						sc.nextLine();
					}
				}
				
				fw.close();
				// Printing Area:
				System.out.println("\n------------------------ Receipt -------------------------");
				System.out.println(String.format("%15s |    %8s |   %8s  |    %9s","Item Name", "Price", "Tax", "Total"));
				System.out.println("----------------------------------------------------------");
				File readingFile = new File("Grocery_receipt.txt");
				Scanner scFile = new Scanner(readingFile);
				
				while (scFile.hasNextLine()) {
					System.out.println(scFile.nextLine());
				}
				scFile.close();
				System.out.println("----------------------------------------------------------");
				System.out.println(String.format("%44s   $ %9.2f", " Total", total));
				
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
