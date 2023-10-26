package Assignment_3_4;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the weight of the package
        System.out.print("Enter the weight of the package in pounds: ");
        double weight = scanner.nextDouble();

        double shippingCharges;

        // Calculate the shipping charges based on the weight
        if (weight <= 2) {
            shippingCharges = 1.10;
        } else if (weight <= 6) {
            shippingCharges = 2.20;
        } else if (weight <= 10) {
            shippingCharges = 3.70;
        } else {
            shippingCharges = 3.80;
        }

        // Display the shipping charges
        System.out.println("The shipping charges for a " + weight + " pound package are: $" + shippingCharges);

        scanner.close();

	}

}
