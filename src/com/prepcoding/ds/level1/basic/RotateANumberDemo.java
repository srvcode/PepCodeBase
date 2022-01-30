package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
 */

public class RotateANumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int temp = n;
		int digitCount = 0;
		while(temp != 0) {
			digitCount++;
			temp = temp/10;
		}
		k = k % digitCount;
		rotateTheNumber(n, k, digitCount);
		scan.close();
	}

	private static void rotateTheNumber(int n, int k, int digitCount) {
		int ans = n;
		if(k > 0) {
			int staticPart = n / (int) Math.pow(10, k);
			int rotatingPart = n % (int) Math.pow(10, k);
			ans = rotatingPart * (int) Math.pow(10, digitCount - k) + staticPart;
		} else if(k < 0) {
			int staticPart = n % (int) Math.pow(10, digitCount + k);
			int rotatingPart = n / (int) Math.pow(10, digitCount + k);
			ans = staticPart * (int) Math.pow(10,-k) + rotatingPart;
		}
		System.out.println(ans);
	}
	
	private static void rotateTheNumberNew(int n, int k, int digitCount) {
		int ans = n;
		if(k > 0) {
			int staticPart = n / (int) Math.pow(10, k);
			int rotatingPart = n % (int) Math.pow(10, k);
			ans = rotatingPart * (int) Math.pow(10, digitCount - k) + staticPart;
		} else if(k < 0) {
			int staticPart = n % (int) Math.pow(10, digitCount + k);
			int rotatingPart = n / (int) Math.pow(10, digitCount + k);
			ans = staticPart * (int) Math.pow(10,-k) + rotatingPart;
		}
		System.out.println(ans);
	}

}
