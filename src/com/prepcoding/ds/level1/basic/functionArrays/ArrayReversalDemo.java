package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question: Reverse an array
 
 * Approach 1: Copy the values of input array into a new array in reverse order.
 *  		> Time Complexity : O(n)
 *  		> Space Complexity: O(n)
 *  
 * Approach 2: (Inplace way) Swapping the first & the last value.
 *			> Time Complexity : O(n)
 *			> Space Complexity: O(1)
 */

public class ArrayReversalDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = scan.nextInt();
		}
		
		reverseTheArray(input);
		
		for(int i = 0; i < n; i++) {
			System.out.print(input[i] + " ");
		}
		
		scan.close();
	}

	private static void reverseTheArray(int[] input) {
		
		int n = input.length;
		for(int i = 0, j = n-1; i < n/2; i++,j--) {
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
	}

}
