package com.Variables;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a Word:- ");
		String word = user.next();
		
		StringBuffer sb = new StringBuffer(word);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse Word:- " + rev);
		System.out.println("Hello Ap Bye bye Ycp");
		
	}
}
