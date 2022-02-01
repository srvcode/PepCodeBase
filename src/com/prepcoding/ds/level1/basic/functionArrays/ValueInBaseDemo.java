package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;
/*
 * Given a decimal number 'n', we're required to convert n into the required base 'b'
 * 
 * Analysis
 
 1. Time Complexity:- We're extracting digits of number n & performing some minute calculations, which will take O(log10 n) time
 as there can be maximum floor (log10 n) digits in a number n.
 
 2. Space Complexity:- We just need to store a few variables like ans, multipler, rem; hence O(1) auxiliary space is required. 
 
 */

public class ValueInBaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(getValueInBase(n, b));
		
		scan.close();
	}

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
