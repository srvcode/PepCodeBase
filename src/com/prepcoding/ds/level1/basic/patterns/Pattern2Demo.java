package com.prepcoding.ds.level1.basic.patterns;

import java.util.Scanner;

/*
 
 n = 5
 
* * * * *
* * * *
* * *
* *
* 
 
 */

public class Pattern2Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = n; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		scan.close();
	}

}
