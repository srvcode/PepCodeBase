package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Given a number n, and a digit d, you are required to calculate the frequency of digit d in number n.
 * 
 * Analysis:
 
 1. Time Complexity:- We're extracting digits of number n which will take O(log10 n) time as there can be
 maximum floor(log 10) digits in a number n.
 
 2. Space Complexity:- We just need to store the count of matched digits in an integer variable counter; hence O(1) auxiliary space is required.
 
 */

public class DigitFrequencyDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		
		int f = getDigitFrequency(n, d);
		System.out.println(f);
		scan.close();
	}

	private static int getDigitFrequency(int n, int d) {
		
		int dCounter = 0;
		while(n != 0) {
			int digit = n % 10;
			if(digit == d) {
				dCounter++;
			}
			n = n/10;
		}
		return dCounter;
	}

}
