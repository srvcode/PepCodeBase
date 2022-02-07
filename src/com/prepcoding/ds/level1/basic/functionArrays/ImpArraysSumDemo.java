package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question:
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

 * 
 * Time Complexity: O(n) as time complexity is linear because for & while loops are used.
 * Space Complexity: O(n) as a 1D array is used in the code, therefore space complexity is constant.
 *
 */

public class ImpArraysSumDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = scan.nextInt();
		}

		int n2 = scan.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = scan.nextInt();
		}

		printArraySum(n1, arr1, n2, arr2);

		scan.close();
	}

	private static void printArraySum(int n1, int[] arr1, int n2, int[] arr2) {
		int n = Math.max(n1, n2);
		int[] finalArr = new int[n];
		int i = n1 - 1;
		int j = n2 - 1;
		int k = n - 1;
		int carry = 0;
		while (k >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += arr1[i--];
			}
			if (j >= 0) {
				sum += arr2[j--];
			}
			carry = sum / 10;
			sum = sum % 10;
			finalArr[k--] = sum;
		}
		if (carry > 0) {
			System.out.println(carry);
		}

		for (int value : finalArr) {
			System.out.println(value);
		}
	}

}
