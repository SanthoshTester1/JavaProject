package FAQ.Programs;

import java.util.Scanner;

public class PalindromeString$5 {
	public static void main(String[] args) {
		System.out.print("Enter name:- ");
		Scanner user = new Scanner(System.in);
		String word = user.nextLine();
		String revword = "";
		int len = word.length();
		for(int i =len-1 ; i>=0; i--) {
			revword += word.charAt(i);
		}
			
		System.out.println(revword);
		
		/*
		 * StringBuffer sb = new StringBuffer(word); StringBuffer rev = sb.reverse();
		 * System.out.println(rev);
		 */
		if (word.equals(revword)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
