package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question:
	1. You are given a base b.
	2. You are given two numbers n1 and n2 of base b.
	3. You are required to subtract n1 from n2 and print the value.
 */

public class AnyBaseAdditionDemo {

	/*
	 * Time complexity: O(log10 (max(n1,n2)+1))
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int sum = printSum(base, n1, n2);
		System.out.println(sum);
		
		scan.close();
	}

	private static int printSum(int base, int n1, int n2) {
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		int ans = 0;
		int count = 0;
		int carry = 0;
		while(max != 0) {
			int digitSum = (max % 10 + min % 10) + carry;
			int rem = digitSum % base;
			carry = digitSum / base;
			ans += rem * Math.pow(10, count);
			count++;
			max = max/10;
			min = min/10;
		}
		ans += carry * Math.pow(10, count);
		return ans;
	}

}
