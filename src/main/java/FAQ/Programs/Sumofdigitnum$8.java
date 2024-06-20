package FAQ.Programs;

import java.util.Scanner;

public class Sumofdigitnum$8 {
	public static void main(String[] args) {
		System.out.print("Enter Num:- ");
		Scanner user = new Scanner(System.in);
		int Num = user.nextInt();
		String conword = String.valueOf(Num);
		int Len = conword.length();
		int Count =0;
		
		for(int i =0 ; i<Len; i++) {
			int ch = Character.getNumericValue(conword.charAt(i));
			Count += ch;
		}
		System.out.println("Total Sum:- " + Count);

	}
}
