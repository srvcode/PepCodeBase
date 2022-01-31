package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.
 */

public class GcdAndLcmDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		findGcdAndLcm(Math.min(num1, num2), Math.max(num1, num2));
		
		scan.close();
	}

	private static void findGcdAndLcm(int smallNum, int largeNum) {
		
		int product = smallNum * largeNum;
		int rem = largeNum % smallNum;
		int lcd = smallNum;
		while(rem != 0) {
			largeNum = smallNum;
			smallNum = rem;
			rem = largeNum % smallNum;
			if(rem == 0) {
				lcd = smallNum;
			}
		}
		System.out.println(lcd);
		int lcm = product/lcd;
		System.out.print(lcm);
	}

}
