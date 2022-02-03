package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question: 
	1. You are given a base b.
	2. You are given two numbers n1 and n2 of base b.
	3. You are required to add the two numbes and print their value in base b.
 */

public class AnyBaseToAnyBaseDemo {

	/*
	 * Time Complexity : O(log10 n) + O(log10 n) = O(log10 n)
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sourceBase = scan.nextInt();
		int destBase = scan.nextInt();
		int anyBaseToDecimal = getDecimalNumber(n, sourceBase);
		int decimalToDestBase = getValueInBase(anyBaseToDecimal, destBase);
		System.out.println(decimalToDestBase);
		scan.close();
	}

	/*
	 * Time Complexity : O(log10 n)
	 */
	private static int getDecimalNumber(int n, int b) {
		int ans = 0;
		int count = 0;
		while(n != 0) {
			int rem = n % 10;
			ans += rem * Math.pow(b, count);
			count++;
			n = n/10;
		}
		return ans;
	}
	
	/*
	 * Time Complexity : O(log10 n)
	 */
	private static int getValueInBase(int n, int b) {
		int ans = 0;
		int multiplier = 0;
		while(n != 0) {
			int rem = n % b;
			ans += rem * Math.pow(10, multiplier);
			multiplier++;
			n = n / b;
		}
		return ans;
	}

}
