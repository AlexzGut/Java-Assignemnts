package com.lcit.assignments;

import javax.swing.JOptionPane;
//import java.io.*;

public class Assignment_2 {

	public static void main(String[] args) { // throws IOException
		
		//PrintWriter outputFile = new PrintWriter("Paystyb.txt");		
		final String OUTPUT = "Employee Paystub\n\n" +
							  "Employee\n" + 
							  "--------------------------------------------------------------\n" +
							  "%-20s\n" + // name address
							  "%s\n\n" +
							  String.format("%-25s %-10s %-10s %-10s\n", "Earnings and Hours", "Qty", "Rate", "Current") +
							  "--------------------------------------------------------------\n" +
							  String.format("%-25s", "Solo Hourly Rate") + " %,-10.2f $%,-10.2f $%,.2f\n" +
							  String.format("%-25s", "Holiday Rate") + " %,-10d $%,-10.2f $%,.2f\n" +
							  "                         -------------------------------------\n" +
							  String.format("%-25s", "") + " %,-22.2f $%,.2f\n" +
							  "Taxes\n" +
							  "--------------------------------------------------------------\n" +
							  String.format("%-48s", "CPP - Employee") + "-$%,.2f\n" +
							  String.format("%-48s", "EI - Employee") + "-$%,.2f\n" +
							  String.format("%-48s", "Federal Income Tax") + "-$%,.2f\n" +
							  "                                              ----------------\n" +
							  String.format("%-25s", "Bonus 10%%") + "  %,-10.2f $%,-10.2f $%,.2f\n" +
							  String.format("%-49s", "Net Pay") + "$%,-10.2f\n";

		final double SOLO_PAY_RATE = 18.50,
					 HOLIDAY_PAY = 151.32,//18.50 * 8 * 1.1,
			         BONUS_PCT = 0.10,
			         CPP_EMPLOYEE = 0.0595, // Canada Pension Plan
					 EI_EMPLOYEE = 0.0163, // Employment Insurance
					 FEDERAL_TAX = 0.115; 
		double hoursWorked,
			   bonusHours,
			   regularPay,
			   bonusPay,
			   holidaysPay,
			   earnings,
			   ccpTax,
			   eiTax,
			   federalTax,
			   netPay;
		int holidays;
		
		hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Hours worked"));
		
		holidays = Integer.parseInt(JOptionPane.showInputDialog("Holidays"));
		
		bonusHours = Double.parseDouble(JOptionPane.showInputDialog("Bonus Hours worked"));
		
		regularPay = hoursWorked * SOLO_PAY_RATE;
		holidaysPay = holidays * HOLIDAY_PAY;
		earnings = regularPay + holidaysPay;
		
		ccpTax = earnings * CPP_EMPLOYEE;
		eiTax = earnings * EI_EMPLOYEE;
		federalTax = earnings * FEDERAL_TAX;
		
		bonusPay = bonusHours * SOLO_PAY_RATE * BONUS_PCT;
		
		netPay = earnings + bonusPay - ccpTax - eiTax - federalTax;
		
		System.out.printf(OUTPUT, "Will", "347 Lawson Rd, Scarborough, ON",
								   hoursWorked, SOLO_PAY_RATE, regularPay,
								   holidays, HOLIDAY_PAY, holidaysPay,
								   hoursWorked + holidays, earnings,
								   ccpTax,
								   eiTax,
								   federalTax,
								   bonusHours, SOLO_PAY_RATE, bonusPay,
								   netPay);
		
		//outputFile.close();
		System.exit(0);
	}
}
