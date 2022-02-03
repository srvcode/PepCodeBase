package com.prepcoding.ds.level1.basic.functionArrays;

import java.util.Scanner;

public class AnyBaseSubtractionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int diff = getDifference(base, n1, n2);
		System.out.println(diff);
		
		scan.close();
	}

	private static int getDifference(int base, int n1, int n2) {
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		int ans = 0;
		int count = 0;
		int borrow = 0;
		while(max != 0) {
			int maxDigit = max % 10 - borrow;
			int minDigit = min % 10;
			int diff = 0;
			if(maxDigit < minDigit) {
				diff = (maxDigit + base) - minDigit;
				borrow = 1;
			} else {
				diff = maxDigit - minDigit;
				borrow = 0;
			}
			ans += diff * Math.pow(10, count);
			count++;
			max = max/10;
			min = min/10;
		}
		return ans;
	}

}
