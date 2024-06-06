package FAQ.Programs;

import java.util.Scanner;

public class Reversenumber$2 {
	public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	System.out.print("Enter a Number:- ");
	int num = user.nextInt();
	String Connum = String.valueOf(num);
	int len = Connum.length();
	String revnum = "";
	
	for(int i = len-1 ; i >=0 ; i--) {
		revnum += Connum.charAt(i);
	}
	System.out.println(revnum);
	}
}
