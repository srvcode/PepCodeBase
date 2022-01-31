package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * 1. You are required to check if a given set of numbers is a valid Pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a Pythagorean triplet and false otherwise.
 */

public class PythagoreanTripletDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int maxAB = Math.max(a, b);
		int maxABC = Math.max(maxAB, c);

		if (maxABC == a) {
			System.out.println((b * b + c * c) == (a * a));
		} else if (maxABC == b) {
			System.out.println((a * a + c * c) == (b * b));
		} else {
			System.out.println((a * a + b * b) == (c * c));
		}

		scan.close();
	}

}
