package ArraysConcepts;
import java.util.Scanner;


public class Findelementarray$3 {
	public static void main(String[] args) {
		int[] Values = {10,5,8,44,19,7,1,8};
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a Number:- " );
		int Num = user.nextInt();
		boolean flag = false;
		int len = Values.length;
		
		for(int i =0 ; i <=len ; i++){
			if(Values[i] == Num){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Element Found");
		}else {
			System.out.println("No Element Found");
		}
	}
}
