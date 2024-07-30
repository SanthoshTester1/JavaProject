package Practice;

import java.util.HashMap;

public class StringCharOccurUsingHashMap {
	static String word ="santhosh";

	static  char[] charword = word.toCharArray();
	
	
	public static void main(String[] args) {
		
	HashMap<Character , Integer> hash = new HashMap();
		for(int i =0; i <charword.length;i++) {
			if(hash.containsKey(charword[i])) {
				hash.put(charword[i], hash.get(charword[i]) + 1);
			}
			else {
				hash.put(charword[i], 1);
				
			}
		}
		System.out.println(hash);
	}
}
