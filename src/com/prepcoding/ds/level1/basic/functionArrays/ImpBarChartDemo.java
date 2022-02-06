package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

/*
 * Question:You are given an array of n elements. Each element depicts the height of a vertical bar.
  
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) as A 1D array is used.
 * 
 */
public class ImpBarChartDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		printBarChart(n, arr);
		
		scan.close();
	}

	private static void printBarChart(int n, int[] arr) {
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < n; j++) {
				if(max - arr[j] <= i) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
