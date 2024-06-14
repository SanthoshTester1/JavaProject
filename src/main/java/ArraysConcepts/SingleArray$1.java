//1. Define a Single Dimentional Array Store and Some Values Read them ?

/** What is Array ? 
 * Array is a Homogeniuos Data Type it can be Stored Similer data type Values 
 * Once Fixed Array size it can't be Increased Size.
 */

package ArraysConcepts;

public class SingleArray$1 {
	public static void main(String[] args) {
		int[] Values = new int[5];
		Values[0] = 5;
		Values[1] = 1;
		Values[2] = 11;
		Values[3] = 14;
		Values[4] = 10;
		
		int len = Values.length;
		
		for(int i = 0 ; i <= len ; i++) {
			System.out.println("Values["+i+"] = " + i);
		}
		System.out.println("Scussfully Completed");
	}
}
