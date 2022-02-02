package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question: Given a number 'n' & its base 'b' & we're required to convert the number 'n' into a decimal number.
 * 
 * 1. Time Complexity: O(log10 n)
 * 2. Space Complexity: O(1)
 */

public class AnyBaseToDecimalDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		
		int decimalNo = getDecimalNumber(n, b);
		System.out.println(decimalNo);
		scan.close();
	}

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

}
