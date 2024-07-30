package Practice;

public class StringOccuranceofChar {
	static boolean flag=false;
	static int Count = 1;
	static String UniqueChar = "";
	public static void main(String[] args) {
		String s = "charichintuii";
		
		
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			flag = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (arr[i] == arr[j]) {
					Count = Count + 1;
					UniqueChar = "" + arr[i];
					flag = true;
				}
			}
			if (flag) {
				System.out.println("Key " + UniqueChar + " Value " + Count);
			}

			Count = 1;
		}

	}
}
