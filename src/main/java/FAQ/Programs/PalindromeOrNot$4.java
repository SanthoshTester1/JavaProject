package FAQ.Programs;

import java.util.Scanner;

public class PalindromeOrNot$4 {
	public static void main(String[] args) {
		System.out.print("Enter a Number:- ");
		Scanner user = new Scanner(System.in);
		int num = user.nextInt();
		String strvalue = String.valueOf(num);
		
		StringBuffer sb = new StringBuffer(strvalue);
		sb.reverse();
		String strrevvalue = String.valueOf(sb);
		if(strvalue.equals(strrevvalue)){
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Given Number is not Palindrome");
		}
	}
}
