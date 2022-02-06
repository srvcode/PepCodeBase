package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

public class ArrayDifferenceDemo {

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

		int k = n2;
		int i = n1;
		int j = n2;
		int diff = 0;
		while(k >= 0) {
			if(i >= 0 && j >= 0) {
				if(arr2[j] < arr1[i]) {
					diff = arr2[j] + 10 - arr1[i] - borrow;
					borrow = -1;
				} else {
					diff = arr2[j] - arr1[i] - borrow;
					borrow = 0;
				}
				diff += arr2[j--];
			}
		}
	}

}
