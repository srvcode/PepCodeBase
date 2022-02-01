package com.prepcoding.ds.level1.basic.patterns;

import java.util.Scanner;

/*
 
 n = 5;
 
 * * * * *
   * * * *
     * * *
       * *
       	 *
 
 */

public class Pattern4Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int j = 1;
			while(j++ < i) {
				System.out.print("\t");
			}
			int k = n - i + 1;
			while(k-- > 0) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
