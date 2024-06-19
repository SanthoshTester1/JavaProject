package FAQ.Programs;

import java.util.Scanner;

public class Countofdigitsnumber$6 {
	public static void main(String[] args){
		System.out.print("Enter a Number:- ");
		Scanner user = new Scanner(System.in);
		int number = user.nextInt();
		String Convword = String.valueOf(number);
		int len = Convword.length();
		int Count = 0;
		for(int i = 1; i <=len ;i++) {
			Count++;
		}
		System.out.println("Total Digits in Given Number:- "+ Count);
	}
}
