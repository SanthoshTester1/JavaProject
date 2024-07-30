package starsPrograms;


public class StringWordreverse {
	
	public static void main(String[] args) {
		String words = "Hi How are you";	
		String[]  w    = words.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String rev : w) {
			for(int i = rev.length()-1; i >=0; i--) {
				//System.out.print(rev.charAt(i) );
				sb.append(rev.charAt(i));
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
	
}
