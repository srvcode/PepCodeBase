package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * Print Fibonacci Numbers Till N
 */

public class FibonacciTillNDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		printFibonnaciTillN(n);
		scan.close();
	}

	private static void printFibonnaciTillN(int n) {
		int a = 0; int b = 1;
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				System.out.println(a);
			} else if(i == 2) {
				System.out.println(b);
			} else {
				int sum = a + b;
				System.out.println(sum);
				a = b;
				b = sum;
			}
			
		}
	}

}
