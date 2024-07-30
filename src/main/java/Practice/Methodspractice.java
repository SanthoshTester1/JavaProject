package Practice;

public class Methodspractice {
		
	public String modifiying(String str) {
	     return str += " santhu";
	}
	
	public static void modifi(int num) {
		 num += 52;
		 System.out.println(num);
	}
	
	public static void main(String[] args) {
		String	name = "Testing";
		modifi(10);
		Methodspractice pr = new Methodspractice(); 
		String  hold=	pr.modifiying(name);
		System.out.println(name);
		System.out.println(hold);
		}
}
