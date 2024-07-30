package FAQ.Programs;

import java.util.Scanner;

public class BottlesProgram {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Number_ofFullBottles:-  ");
		int num_OfBootles = user.nextInt();
		System.out.print("Number_of EmptyBootles:-  ");
		int num_ofEmpty = user.nextInt();
		
		int sum = 0;
		sum += num_OfBootles;
		int drink_full = num_OfBootles / num_ofEmpty;
		sum += drink_full;
		System.out.println(drink_full);
		int reaming_empty1 = num_OfBootles % num_ofEmpty;
		System.out.println(reaming_empty1);
		sum += num_OfBootles;
		int reaming = drink_full + reaming_empty1;
		int reaming_empty2 = reaming/num_ofEmpty; 
		
		
		
		
	}
}
