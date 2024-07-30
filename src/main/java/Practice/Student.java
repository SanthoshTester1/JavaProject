package Practice;

public class Student {
	String Name;
	int    RollNo;
	String Studentclass;
	double Percentage;

	Student(){
		Percentage =60;
	}
    void setName(String name){
    	 Name  =name;
     }
    void setRollno(int rollno) {
    	RollNo = rollno;
    }
    void setStudentClass(String stuclass) {
    	Studentclass = stuclass;
    }
    void setPercentage(double percen) {
    	Percentage = percen;
    }

    public String getName(){
    		return Name;
    }
    
    public int  getRollno(){
            return RollNo; 	
    }
    public String getStudentClass() {
    	    return Studentclass;
    }
    public double getPercentage() {
    		return Percentage;
    }
    
    
    
    
    
    
    
    
}
