package com.cestar.assignment5;

public class CoinTossSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin coin = new Coin();
		System.out.println("Initial face up: " + coin.getSideUp());
		int heads = 0;
		int tails = 0;
		
		for (int i = 1; i <= 20; i++) {
			coin.toss();
			System.out.println("Toss #" + i + ": " + coin.getSideUp());
			if (coin.getSideUp().equals("tails")) {
				tails++;
			} else {
				heads++;
			}
		}
		
		System.out.println("Heads: " + heads + "\nTails: "+ tails);
	}

}
