package Practice;

import java.util.Scanner;

public class Customer extends KiranamShop {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount:- ");
		int User = sc.nextInt();
		String pocket = ChipsPocket(User);
		System.out.println(pocket);
		
	}
}
