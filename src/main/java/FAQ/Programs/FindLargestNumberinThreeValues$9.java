package FAQ.Programs;

public class FindLargestNumberinThreeValues$9 {
	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		int c = 8;

		if (a > b && a > c) {
			System.out.println("Biggest Value:- " + a);
		} else if (b > a && b > c) {
			System.out.println("BIggest Value:- " + b);
		} else if (c > a && c > b) {
			System.out.println("biggest value " + c);
		}
	}
}
