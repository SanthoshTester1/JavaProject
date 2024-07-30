package Practice;

public class Dashboard {
	public static void main(String[] args) {
		Student s = new Student();
		/*
		 * s.Name = "Santhosh"; s.RollNo = 15; s.Studentclass = "2nd year"; s.Percentage
		 * = 84.7;
		 * 
		 * System.out.println(s.Name); System.out.println(s.RollNo);
		 * System.out.println(s.Studentclass); System.out.println(s.Percentage);
		 */
		s.setName("SaiPrasad");
		s.setRollno(54);
		s.setPercentage(98.9);
		s.setStudentClass("Final Year");

		System.out.println(s.getName());
		System.out.println(s.getPercentage() +"By set Value");
		System.out.println(s.getRollno());
		System.out.println(s.getStudentClass());
		System.out.println("*****************************");
		Student s1 = new Student();
		s1.setName("Manoj");
		s1.setRollno(45);
		s1.setStudentClass("3rd year");
		s1.setPercentage(45.6);
		
		System.out.println(s1.getName());
		System.out.println(s1.getPercentage() + "By set Value");
		System.out.println(s1.getRollno());
		System.out.println(s1.getStudentClass());
		System.out.println("*****************************");
		
		Student s3 = new Student();
		s3.setName("");
		s3.setRollno(25);
		s3.setStudentClass("5th year");
		
		System.out.println(s3.getName());
		System.out.println(s3.getPercentage() +"By Default Value");
		System.out.println(s3.getRollno());
		System.out.println(s3.getStudentClass());
		
	}
}
