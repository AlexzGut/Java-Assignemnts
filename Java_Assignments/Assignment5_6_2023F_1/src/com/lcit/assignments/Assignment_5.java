package com.lcit.assignments;

import java.util.Random;

/**
 * This program consist of two classes, one of them is the Coin class. This
 * class has a private field named sideUp, that will hold the value "tails" or
 * "heads". It also has a no-arg constructor used to initialized the value of
 * the sideUp field. To toss the coin this class comes with a public method
 * called toss which is using a Random object to get a boolean value and
 * according to this value assign either "tails" or "heads" to the sideUp field.
 * Because the sideUp field is private this class provides a getter (accessor)
 * to get the value of the sideUp field. On the main method a Coin instance is
 * created, this coin object is tossed 20 times, and the program displays and
 * keeps record of the side up for every toss action.
 * 
 * @param args
 */
public class Assignment_5 {

	public static void main(String[] args) {
		Coin coin = new Coin();
		int headsCounter = 0, tailsCounter = 0;

		System.out.println("Initial side facing up: " + coin.getSideUp());
		System.out.println("\nTossing the coin 20 times...");
		System.out.println("\nSide up");

		for (int i = 1; i <= 20; i++) {
			coin.toss();
			System.out.print(coin.getSideUp() + ((i % 10 == 0) ? "\n" : ", "));

			if (coin.getSideUp().equals("heads")) {
				headsCounter++;
			} else {
				tailsCounter++;
			}
		}
		System.out.println("\nTotal\n" + "heads   tails\n" + "-------------");
		System.out.printf("%-8s %s", headsCounter, tailsCounter);

	}

}

class Coin {
	private String sideUp;

	public Coin() {
		toss();
	}

	public void toss() {
		Random randomNumber = new Random();
		sideUp = randomNumber.nextBoolean() ? "heads" : "tails";
	}

	public String getSideUp() {
		return sideUp;
	}
}
