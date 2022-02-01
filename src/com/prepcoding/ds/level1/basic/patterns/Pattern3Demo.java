package com.prepcoding.ds.level1.basic.patterns;

import java.util.Scanner;

/*
 
 n = 5;
 
         *
       * *
     * * *
   * * * *
 * * * * *
  
 */

public class Pattern3Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int j = n - i;
			while(j-- > 0) {
				System.out.print("\t");
			}
			int k = n - i;
			while(k++ < n) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
