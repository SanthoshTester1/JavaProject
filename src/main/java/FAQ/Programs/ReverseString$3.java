package FAQ.Programs;

import java.util.Scanner;

public class ReverseString$3 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a Word :- " );
		String word = user.nextLine();
		
		StringBuffer sb = new StringBuffer(word);
		StringBuffer rev = sb.reverse();
		System.out.println("After Reverse:-  "+ rev);
	}

}