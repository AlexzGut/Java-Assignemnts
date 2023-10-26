package Assignment_3_4;

import java.util.Scanner;

public class Assignmnet_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        double stateTaxRate = 0.06;  // State tax rate (6%)
        double countyTaxRate = 0.02; // County tax rate (2%)
        
        double totalPurchase = 0.0;
        double totalStateTax = 0.0;
        double totalCountyTax = 0.0;

        System.out.println("Welcome to the Grocery Store!");

        while (true) {
            System.out.print("Enter the name of the item (or 'exit' to finish shopping): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the quantity of " + itemName + ": ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the price of " + itemName + " per item: ");
            double itemPrice = scanner.nextDouble();

            // Calculate taxes
            double stateTax = itemPrice * stateTaxRate;
            double countyTax = itemPrice * countyTaxRate;

            // Calculate the total for the item
            double itemTotal = (itemPrice + stateTax + countyTax) * quantity;

            // Update totals
            totalPurchase += itemTotal;
            totalStateTax += stateTax * quantity;
            totalCountyTax += countyTax * quantity;

            // Display item details
            System.out.println("Item: " + itemName);
            System.out.println("Price: $" + itemPrice);
            System.out.println("State Sales Tax: $" + stateTax);
            System.out.println("County Sales Tax: $" + countyTax);
            System.out.println("Final Price (including taxes): $" + itemTotal);
            System.out.println();

            // Consume the newline character left by nextDouble
            scanner.nextLine();
        }

        // Display the summary
        System.out.println("Total Purchase: $" + totalPurchase);
        System.out.println("Total State Sales Tax: $" + totalStateTax);
        System.out.println("Total County Sales Tax: $" + totalCountyTax);
        System.out.println("Total Sales Tax: $" + (totalStateTax + totalCountyTax));
        System.out.println("Total Sale: $" + (totalPurchase + totalStateTax + totalCountyTax));

        scanner.close();

	}

}
