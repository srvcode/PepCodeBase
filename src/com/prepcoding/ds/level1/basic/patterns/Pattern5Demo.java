package com.prepcoding.ds.level1.basic.patterns;

import java.util.Scanner;

/*
 
 n = 5;
 
     * 
   * * *
 * * * * *
   * * *
     *
 
 */

public class Pattern5Demo {
/*
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sp = n/2, st = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			
			if(i <= n/2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.out.println();
		}
		scan.close();
	} */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int mid = n/2, st = 1;
		for(int i = 1; i <= n; i++) {
			
			System.out.println();
		}
		scan.close();
	}

}
