package Assignment_1_2;

import java.util.Scanner;

public class Assignmnet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
        int age;
        double annualPay;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter your desired annual income: ");
        annualPay = scanner.nextDouble();

        scanner.close();

        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");

	}

}
