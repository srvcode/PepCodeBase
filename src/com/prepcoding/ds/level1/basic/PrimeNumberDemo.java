package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * Question: Given a number n, check whether n is prime or not prime.
 */


public class PrimeNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int i = 0; i < testcase; i++) {
			int n = scan.nextInt();
			//isPrimeBrute(n);
			isPrimeEfficient(n);
			
		}
		scan.close();
	}

	private static void isPrimeBrute(int n) {
		boolean flag = true;
		for(int i=2; i < n; i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
	
	
	private static void isPrimeEfficient(int n) {
		boolean flag = true;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		
	}

}
