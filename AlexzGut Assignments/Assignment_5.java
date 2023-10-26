package com.lcit.assignments;

import java.util.Random;

public class Assignment_5 {

	public static void main(String[] args) {
		Coin coin = new Coin();
		int heads = 0,
			tails = 0;
		
		System.out.println("Initial side facing up: " + coin.getSideUp());
		System.out.println("\nTossing the coin 20 times...");
		System.out.println("\nSide up");
		
		for (int i = 1; i <= 20; i++) {
			coin.toss();
			System.out.print(coin.getSideUp() + " ");
			if (i % 10 == 0) System.out.println();
			if (coin.getSideUp().equals("heads")) heads++;
			if (coin.getSideUp().equals("tails")) tails++;
		}
		System.out.println("\nTotal\n" +
						   "heads   tails\n" +
						   "-------------");
		System.out.printf("%-8s %s", heads, tails);

	}

}

class Coin {
	private String sideUp;

	public Coin() {
		toss();
	}
	
	public void toss() {
		Random randomNumber = new Random();
		sideUp = randomNumber.nextInt(2) == 0 ? "heads" : "tails";
	}
	
	public String getSideUp() {
		return sideUp;
	}
	
}
