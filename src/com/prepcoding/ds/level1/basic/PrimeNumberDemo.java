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

	/*
	 * This solution has a drawnback 
	 * i.e. the given constraints on the variables, 't' & 'n' are too large for the computational power to compute within 1 second.
	 * Constraints: 1 <= t <= 10^4 && 2 <= n < 10^9
	 * The processor has the computational power to compute about (10)^9 operations within 1 second,
	 * which is due to the fact that it runs 3*(10)^9 clock cycles/sec.
	 * Our code returns a Time Limit Exceeded (TLE) error because it takes to much time to compute.
	 * "Not only should our program be correct but also effectively time & memory efficient."
	 * 
	 * The outer loop runs for (10)^4 times (depends on t). The inner loop runs for (10)^9 times (depends on n).
	 * And the instructions inside the inner loop run for (10)^4*(10)^9=(10)^13 times, which can't be computed in 1 second.
	 */
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
	
	/*
	 * 1. Time complexity: O(t*square root n)
	 * 	> A for loop runs for t times & for each iteration a while loop runs for root n times 
	 *    making the time complexity of this program to be O(t*sqrt(n)).
	 * 
	 * 2. Space complexity: O(1)
	 * 	> Since no effective extra space has been used, therefore the time complexity of the program remains constant.
	 */
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
