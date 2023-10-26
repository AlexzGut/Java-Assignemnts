package Assignment_1_2;

import java.util.Scanner;

public class Assignmnet_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hoursWorked;
        double payRate;
        double bonusPercentage;
        double taxPercentage;
        double bonusHours;
        double finalPay;

        // Use the Scanner class to take user input
        Scanner scanner = new Scanner(System.in);

        // Input hours worked
        System.out.print("Enter hours worked: ");
        hoursWorked = scanner.nextDouble();

        // Input bonus hours
        System.out.print("Enter bonus hours: ");
        bonusHours = scanner.nextDouble();

        // Input pay rate
        System.out.print("Enter pay rate: ");
        payRate = scanner.nextDouble();

        // Input bonus percentage
        System.out.print("Enter bonus percentage: ");
        bonusPercentage = scanner.nextDouble();

        // Input tax percentage
        System.out.print("Enter tax percentage: ");
        taxPercentage = scanner.nextDouble();

        // Calculate final pay
        double regularPay = hoursWorked * payRate;
        double bonusPay = bonusHours * (payRate * (bonusPercentage / 100));
        double taxAmount = (regularPay + bonusPay) * (taxPercentage / 100);
        finalPay = (regularPay + bonusPay) - taxAmount;

        // Close the scanner
        scanner.close();

        // Display Will's final pay
        System.out.println("Will's final pay is: $" + finalPay);
		
		

	}

}
