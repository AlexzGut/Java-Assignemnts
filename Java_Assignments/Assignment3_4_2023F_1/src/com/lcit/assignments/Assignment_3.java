package com.lcit.assignments;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * This program asks the user to enter the name and number of items of a purchase on a grocery store.
 * It starts by asking the user to enter the state to calculate the state taxes accordingly. 
 * Then it asks for the name of the item and the quantity to be purchased. Data validation is done to ensure
 * the state name is enter correctly. The prices of the products are computed using random numbers.
 * The output (receipt) is built using the format() method of the String class. The JOptionPane class is used
 * to get the input from the user, and the output is displayed on the console.
 * @param args */
public class Assignment_3 {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		final String HEADER = "                                                 STAR SHOP                                          \n" +
						      "                                               347 Lawson Rd                                        \n" +
						      "                                            Tel: (647)860-1662                                      \n" +
						      "****************************************************************************************************\n" +
						      "                                                  RECEIPT                                           \n" +
						      "****************************************************************************************************\n" +
						      String.format("%-16s %-7s %-12s %-15s %-15s %-17s %s\n", "Description", "Qty" , "Price c/u", "Price w/o Tax", "State Tax", "Country Tax", "Final Price");
		final double COUNTRY_TAX = 0.08;
					 
		String itemName,
			   again = "y",
			   output = HEADER,
			   state;
		double itemPrice,
			   itemCountryTax,
			   itemStateTax,
			   itemPriceNoTax,
			   itemFinalPrice,
			   subtotal = 0,
			   countryTax,
			   stateTax = 0.0,
			   stateTaxTotal,
			   total;
		int quantity,
			i = 1;
		
		JOptionPane.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" +
											" This program calculates the total \n" +
											" amount of a purchase. \n" +
											"=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		while (stateTax == 0) {
			state = JOptionPane.showInputDialog("Select your state [press H for help]: ");
			switch (state.toUpperCase()) {
			case "ON":
				stateTax = 0.08;
				break;
			case "AB": case "BC": case "MB": case "NT":
			case "NU": case "QC": case "SK": case "YT":
				stateTax = 0.05;
				break;
			case "NB": case "NL": case "NS": case "PE":
				stateTax = 0.07;
				break;
			case "H":
				JOptionPane.showMessageDialog(null, "State Codes:\nAB = Alberta\nBC = British Columbia\nMB = Manitoba\nNT = Northwest Territories\n"+
									"NU = Nunavut\nQC = Quebec\nSK = Saskatchewan\nYT = Yukon\nON = Ontario\n" + 
									"NB = New Brunswick\nNL = Newfoundland and Labrador\nNS = New Scotia\nPE = Prince Edward Island");
				continue;
			default:
				JOptionPane.showMessageDialog(null, "Please insert a valid state code.");
				continue;
			}
		}
		
		do {
			
			itemName = JOptionPane.showInputDialog("Enter the name of the item #" + i + ": ");
			quantity = Integer.parseInt(JOptionPane.showInputDialog("How many of this items would you like to purchase?")) ;
			itemPrice = Double.parseDouble(String.format("%.2f", randomNumber.nextDouble(50) + 30)) ;
			itemCountryTax = (quantity * itemPrice) * COUNTRY_TAX;
			itemStateTax = (quantity * itemPrice) * stateTax;
			
			itemPriceNoTax = quantity * itemPrice;
			itemFinalPrice = itemCountryTax + itemStateTax + (quantity * itemPrice);
			
			subtotal += itemPriceNoTax;
			
			output += String.format("%-16s %-7d $%-,11.2f $%-,14.2f $%-,14.2f $%-,16.2f $%,.2f\n", itemName, quantity, itemPrice, itemPriceNoTax, itemStateTax, itemCountryTax, itemFinalPrice);
			
			i++;
			
			if (i > 5) {
				again = JOptionPane.showInputDialog("Would you like to enter another item? Y/N").toLowerCase();
			}
			
		} while(i <= 5 || again.equals("y"));
		
		output += "-----------------------------------------------------------------------------------------------------\n";
		output += String.format("%-87s $%.2f\n", "Subtotal", subtotal);
		
		countryTax = subtotal * COUNTRY_TAX;
		stateTaxTotal = subtotal * stateTax;
		total = subtotal + countryTax + stateTaxTotal;
		
		output += String.format("%-87s $%,.2f\n", String.format("State Tax %.0f%%", stateTax * 100), countryTax);
		output += String.format("%-87s $%.2f\n", "Country Tax 8%", stateTaxTotal);
		output += "-----------------------------------------------------------------------------------------------------\n";
		output += String.format("%-87s $%,.2f\n", "TOTAL", total);
		System.out.println(output);
		
		System.exit(0);

	}

}
