package com.prepcoding.ds.level1.basic;

import java.util.Scanner;

/*
 * Question: Given number 'n' & its base 'b', convert the number 'n' into a decimal number.
 */

public class AnyBaseToDecimalDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b = scn.nextInt();
	    scn.close();
	    int d = toDecimal(n, b);
	    System.out.println(d);
	}

	private static int toDecimal(int n, int b) {

		int multiplier = 0, ans = 0;
	    while (n > 0) {
	      int remainder = n % 10;
	      n = n / 10;
	      ans += remainder * Math.pow(b, multiplier);
	      multiplier++;
	    }
	    return ans;
	}

}
