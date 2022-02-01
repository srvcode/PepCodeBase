package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question: Given n & r, find nPr.
 */
public class PermutationCombinationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		System.out.println(n + "P" + r + " = " + (getNFactorial(n) / getNFactorial(n-r)));
		scan.close();
	}

	private static int getNFactorial (int n) {
		int nfact = 1;
		for (int i = 1; i <= n; i++) {
			nfact = nfact * i;
		}
		return nfact;
	}

}
