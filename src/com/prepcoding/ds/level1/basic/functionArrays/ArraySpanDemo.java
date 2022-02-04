package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question: Given the size of array n, you are required to find the span of the array.
 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class ArraySpanDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int span = max - min;
		System.out.println(span);
		scan.close();
	}

}
