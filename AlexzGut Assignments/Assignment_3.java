package com.lcit.assignments;

import javax.swing.JOptionPane;
import java.util.Random;


public class Assignment_3 {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		final String HEADER = "                                      STAR SHOP                                 \n" +
						      "                                    347 Lawson Rd                               \n" +
						      "                                 Tel: (647)860-1662                             \n" +
						      "********************************************************************************\n" +
						      "                                       RECEIPT                                  \n" +
						      "********************************************************************************\n" +
						      String.format("%-16s %-7s %-9s %-15s %-17s %s\n", "Description", "Qty" , "Price", "State Tax 5%", "Country Tax 8%", "Final Price");
		final double COUNTRY_TAX = 0.08,
					 STATE_TAX = 0.05;
		String itemName,
			   again = "y",
			   output = HEADER;
		double itemPrice,
			   itemCountryTax,
			   itemStateTax,
			   itemFinalPrice,
			   subtotal = 0,
			   countryTax,
			   stateTax,
			   total;
		int quantity,
			i = 1;
		
		JOptionPane.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" +
											" This program calculates the total \n" +
											" amount of a purchase. \n" +
											"=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		do {
			
			itemName = JOptionPane.showInputDialog("Enter the name of the item #" + i + ": ");
			quantity = Integer.parseInt(JOptionPane.showInputDialog("How many of this items would you like to purchase?")) ;
			itemPrice = Double.parseDouble(String.format("%.2f", randomNumber.nextDouble(50) + 30)) ;
			itemCountryTax = (quantity * itemPrice) * COUNTRY_TAX;
			itemStateTax = (quantity * itemPrice) * STATE_TAX;
			
			itemFinalPrice = itemCountryTax + itemStateTax + (quantity * itemPrice);
			
			subtotal += itemFinalPrice;
			
			output += String.format("%-16s %-7d $%-,8.2f $%-,14.2f $%-,16.2f $%,.2f\n", itemName, quantity, itemPrice, itemStateTax, itemCountryTax, itemFinalPrice);
			
			i++;
			
			if (i > 5) {
				again = JOptionPane.showInputDialog("Would you like to enter another item? Y/N").toLowerCase();
			}
			
		} while(i <= 5 || again.equals("y"));
		
		output += "--------------------------------------------------------------------------------\n";
		output += String.format("%-68s $%.2f\n", "Subtotal", subtotal);
		
		countryTax = subtotal * COUNTRY_TAX;
		stateTax = subtotal * STATE_TAX;
		total = subtotal + countryTax + stateTax;
		
		output += String.format("%-68s $%,.2f\n", "State Tax 5%%", countryTax);
		output += String.format("%-68s $%.2f\n", "Country Tax 8%", stateTax);
		output += "--------------------------------------------------------------------------------\n";
		output += String.format("%-68s $%,.2f\n", "TOTAL", total);
		System.out.println(output);
		//JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);

	}

}
