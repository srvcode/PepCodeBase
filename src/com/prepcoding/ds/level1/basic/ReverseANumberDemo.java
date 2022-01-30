package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * Reverse A Number
 */

public class ReverseANumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		while(input != 0) {
			int rem = input % 10;
			System.out.println(rem);
			input = input / 10;
		}
		scan.close();
	}

}
