package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * Count Digits In A Number
 */

public class CountingDigitsInNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int digitCount = 0;
		while(input != 0) {
			digitCount++;
			input = input/10;
		}
		System.out.println(digitCount);
		scan.close();
	}

}
