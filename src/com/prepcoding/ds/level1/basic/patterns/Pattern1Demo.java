package com.prepcoding.ds.level1.basic.patterns;

import java.util.Scanner;
/*
 
 n = 5
 
 *
 * *
 * * *
 * * * *
 * * * * *
 

 */

public class Pattern1Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j <= i; j++) {
				System.out.println("*\t");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
