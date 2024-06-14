package FAQ.Programs;

import java.util.Scanner;

public class PalindromeString$ {
		public static void main(String[] args) {
			System.out.print("Enter name:- ");
			Scanner user = new Scanner(System.in);
			String word = user.nextLine();
			
			StringBuffer sb = new StringBuffer(word);
			StringBuffer rev = sb.reverse();
			System.out.println(rev);
			if(word.equals(rev)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not Palindrome");
			}
		}
}
