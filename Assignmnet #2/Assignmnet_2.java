package Assignment_1_2;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * This class generates an employee paystub based on user input and writes it to
 * a file.
 */
public class Assignmnet_2 {

	/**
	 * The main method that calculates pay and writes the paystub to a file.
	 *
	 * @throws IOException Signals that an I/O exception has occurred
	 */
	public static void main(String[] args) throws IOException {
		// Creates a PrintWriter to write the paystub to a file named "Paystyb.txt"
		PrintWriter outputFile = new PrintWriter("Paystyb.txt");

		// Format for the paystub
		final String OUTPUT = "Employee Paystub\n\n" + "Employee\n"
				+ "--------------------------------------------------------------\n" + "%-20s\n" + // name address
				"%s\n\n" + String.format("%-25s %-10s %-10s %-10s\n", "Earnings and Hours", "Qty", "Rate", "Current")
				+ "--------------------------------------------------------------\n"
				+ String.format("%-25s", "Solo Hourly Rate") + " %,-10.2f $%,-10.2f $%,.2f\n"
				+ String.format("%-25s", "Bonus 10%%") + "  %,-10.2f $%,-10.2f $%,.2f\n"
				+ String.format("%-25s", "Holiday Rate") + " %,-10d $%,-10.2f $%,.2f\n"
				+ "                         -------------------------------------\n" + String.format("%-25s", "")
				+ " %,-22.2f $%,.2f\n" + "Taxes\n" + "--------------------------------------------------------------\n"
				+ String.format("%-48s", "CPP - Employee") + "-$%,.2f\n" + String.format("%-48s", "EI - Employee")
				+ "-$%,.2f\n" + String.format("%-48s", "Federal Income Tax") + "-$%,.2f\n"
				+ "                                              ----------------\n" + String.format("%-49s", "Net Pay")
				+ "$%,-10.2f\n";

		// Constants and variables for calculations
		final double SOLO_PAY_RATE = 18.50, HOLIDAY_PAY = 151.32, BONUS_PCT = 0.10, CPP_EMPLOYEE = 0.0595,
				EI_EMPLOYEE = 0.0163, FEDERAL_TAX = 0.115;
		double hoursWorked, bonusHours, regularPay, bonusPay, holidaysPay, earnings, ccpTax, eiTax, federalTax, netPay;
		int holidays;

		// Obtains user input for hours worked, bonus hours, and holidays
		hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Hours worked"));
		bonusHours = Double.parseDouble(JOptionPane.showInputDialog("Bonus Hours worked"));
		holidays = Integer.parseInt(JOptionPane.showInputDialog("Holidays"));

		// Calculating various pays and earnings
		regularPay = hoursWorked * SOLO_PAY_RATE;
		bonusPay = bonusHours * SOLO_PAY_RATE * BONUS_PCT;
		holidaysPay = holidays * HOLIDAY_PAY;
		earnings = regularPay + holidaysPay + bonusPay;

		// Calculating taxes
		ccpTax = earnings * CPP_EMPLOYEE;
		eiTax = earnings * EI_EMPLOYEE;
		federalTax = earnings * FEDERAL_TAX;

		// Calculating net pay
		netPay = earnings + bonusPay - ccpTax - eiTax - federalTax;

		// Printing paystub details to the console
		System.out.printf(OUTPUT, "Will", "347 Lawson Rd, Scarborough, ON", hoursWorked, SOLO_PAY_RATE, regularPay,
				bonusHours, SOLO_PAY_RATE, bonusPay, holidays, HOLIDAY_PAY, holidaysPay,
				hoursWorked + holidays + bonusHours, earnings, ccpTax, eiTax, federalTax, netPay);

		// Writing paystub details to the output file
		outputFile.printf(OUTPUT, "Will", "347 Lawson Rd, Scarborough, ON", hoursWorked, SOLO_PAY_RATE, regularPay,
				bonusHours, SOLO_PAY_RATE, bonusPay, holidays, HOLIDAY_PAY, holidaysPay, hoursWorked + holidays,
				earnings, ccpTax, eiTax, federalTax, netPay);

		outputFile.close();
		System.exit(0);
	}
}
