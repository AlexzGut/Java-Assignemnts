package com.cestar.assignment5;

import java.util.Random;

public class Coin {
	
	private String sideUp;
	
	public Coin() {
		Random rd = new Random();
		if (rd.nextBoolean()) {
			sideUp = "tails";
		} else {
			sideUp = "heads";
		}
	}
	
	public String getSideUp() {
		return sideUp;
	}
	
	public void toss() {
		Random rd = new Random();
		if (rd.nextBoolean()) {
			sideUp = "tails";
		} else {
			sideUp = "heads";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
