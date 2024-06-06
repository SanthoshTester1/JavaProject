package ArraysConcepts;

public class ArrayReading$2 {
	public static void main(String[] args) {
		int[] Store = new int[5];
		
		Store[1] = 10;
		Store[2] = 11;
		Store[3] = 2;
		Store[4] = 1;
		Store[0] = 99;
		
		for(int a : Store) {
			System.out.println("Array Element:- " + a);
		}
	}
}
