package starsPrograms;

import java.util.Scanner;

public class RightAngleTriangle1 {
	
	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		System.out.print("Enter A Number:- ");
		int N = user.nextInt();
		for(int i =1 ; i<=N ; i++) {
			for(int j =1 ; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
