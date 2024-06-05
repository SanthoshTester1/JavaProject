package com.Variables;

import java.util.Scanner;

public class Tariangleprogram {
	public static void main(String[] args) {
	System.out.print("Enter a Number:- ");
	Scanner userinput = new Scanner(System.in);
	int Num = userinput.nextInt();
	
	for(int i = 1; i <= Num; i++) {
		for(int j = 1 ; j <= i; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
		
	}
}
