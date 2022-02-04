package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question:
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to multiply n1 and n2 and print the value.
 */

public class AnyBaseMultiplicationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int d = getProduct(b, n1, n2);
		System.out.println(d);
		scan.close();
	}

	private static int getProduct(int b, int n1, int n2) {

		int decimal_n1 = getDecimalNumber(n1, b);
		int decimal_n2 = getDecimalNumber(n2, b);
		int decimal_n1n2 = decimal_n1 * decimal_n2;
		int finalAns = getValueInBase(decimal_n1n2, b);
		return finalAns;
	}

	private static int getDecimalNumber(int n, int b) {
		int ans = 0;
		int count = 0;
		while (n != 0) {
			int rem = n % 10;
			ans += rem * Math.pow(b, count);
			count++;
			n = n / 10;
		}
		return ans;
	}

	private static int getValueInBase(int n, int b) {

		int ans = 0;
		int multiplier = 0;
		while (n != 0) {
			int rem = n % b;
			ans += rem * Math.pow(10, multiplier);
			multiplier++;
			n = n / b;
		}
		return ans;
	}

}
