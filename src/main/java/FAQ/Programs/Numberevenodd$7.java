package FAQ.Programs;
import java.util.Scanner;

public class Numberevenodd$7 {
	public static void main(String[] args) {
		System.out.print("Enter a Number:- ");
		Scanner user = new Scanner(System.in);
		int Num = user.nextInt();
		String Conword = String.valueOf(Num);
		int  len = Conword.length();
		String Even = "";
		String Odd = " ";
		for(int i =0;i<=len-1;i++) {
			char charr = Conword.charAt(i);
			int Numm = Character.getNumericValue(charr);
			if(Numm % 2 == 0) {
				Even += Numm;
			}
			else if(Numm %2 == 1){
				Odd += Numm;
			}
		}
		System.out.println("Enter a Even Number:-" + Even);
		System.out.println("Enter a Odd Number:-" + Odd);
	}
}
