package Assignmnet_5_6;
import java.util.Scanner;

public class Assignmnet_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        int numStores = 5;
        int[] sales = new int[numStores];

        for (int i = 0; i < numStores; i++) {
            System.out.print("Enter today's sales for store " + (i + 1) + ": ");
            sales[i] = scanner.nextInt();
        }

        System.out.println("SALES BAR CHART");

        for (int i = 0; i < numStores; i++) {
            System.out.print("Store " + (i + 1 + ": "));

            for (int j = 0; j < sales[i] / 100; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
		
	}

}
