package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * 1. You are required to display the prime factorization of a number.
2. Take as input a number n.
3. Print all its prime factors from smallest to largest.
 */

public class PrimeFactorizationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrimeFactors(n);
		printPrimeFactorsEfficient(n);
		scan.close();
	}

	private static void printPrimeFactorsEfficient(int n) {

		for (int div = 2; div <= n; div++) {
			while (n % div == 0) {
				System.out.print(div + " ");
				n = n / div;
			}
		}
		if (n != 1) {
			System.out.print(n);
		}
	}

	private static void printPrimeFactors(int n) {
		for (int div = 2; div <= n; div++) {
			while (n % div == 0) {
				System.out.println(div + " ");
				n = n / div;
			}
		}
	}

}
