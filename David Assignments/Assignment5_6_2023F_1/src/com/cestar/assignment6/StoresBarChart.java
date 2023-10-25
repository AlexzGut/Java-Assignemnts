package com.cestar.assignment6;

import java.util.Scanner;

public class StoresBarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Store's Chart Bar");
		int[] storeSales = new int[5];
		
		for (int i = 1; i <= storeSales.length; i++) {
			System.out.print("Enter Store " + i + " Sales': ");
			storeSales[i-1] = sc.nextInt();
		}
		
		System.out.println("\nSALES BAR CHART");
		for (int j = 1; j <= storeSales.length; j++) {
			System.out.print("Store " + j + ": ");
			for (int i = 0; i < storeSales[j-1]/100; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
