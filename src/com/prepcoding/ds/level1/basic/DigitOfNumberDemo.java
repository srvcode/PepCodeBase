package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * Digits Of A Number
 */

public class DigitOfNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		printDigitOfNumber(input);
		// we can use array for storing digits as well
		scan.close();
	}

	private static void printDigitOfNumber(int input) {
		int digitCount = 0;
		int temp = input;
		while(temp != 0) {
			digitCount++;
			temp = temp/10;
		}
		
		while(digitCount-- > 0) {
			int rem = (int) (input / Math.pow(10, digitCount));
			input = (int) (input % Math.pow(10, digitCount));
			System.out.println(rem);
		}
	}

}
