package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

public class PrimeTillNDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int low = scan.nextInt();
		int high = scan.nextInt();
		
		primeTillNBrute(low, high);
		scan.close();
	}

	private static void primeTillNBrute(int low, int high) {
		
		for(int i = low; i <= high; i++) {
			boolean isPrime = isPrimeEfficient(i);
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrimeEfficient(int n) {
		boolean flag = true;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
