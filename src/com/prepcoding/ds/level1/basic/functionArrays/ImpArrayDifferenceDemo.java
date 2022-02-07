package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question:
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

Assumption - number represented by a2 is greater.

 * Time Complexity: O(n2)
 */
public class ImpArrayDifferenceDemo {

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

		printArrayDifference(n1, arr1, n2, arr2);

		scan.close();
	}

	private static void printArrayDifference(int n1, int[] arr1, int n2, int[] arr2) {
		int[] finalArray = new int[n2];
		int borrow = 0;

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = finalArray.length - 1;
		
		while(k >= 0) {
			int diff = 0;
			int arr1v = (i >= 0 ? arr1[i] : 0);
			if(arr2[j] + borrow >= arr1v) {
				diff = arr2[j] + borrow - arr1v;
				borrow = 0;
			} else {
				diff = arr2[j] + 10 + borrow - arr1v;
				borrow = -1;
			}
			finalArray[k] = diff;
			i--;
			j--;
			k--;
		}
		
		int idx = 0;
		while(idx < finalArray.length && finalArray[idx] == 0) {
			idx++;
		}
		
		while(idx < finalArray.length) {
			System.out.println(finalArray[idx++]);
		}
		
	}

}
