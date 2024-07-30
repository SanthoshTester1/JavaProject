package FAQ.Programs;

import com.Variables.OrderPage;

public class MobilePhones {
	OrderPage ord;
	String samsung;
	public void selectSamsung() {
		System.out.println("Your in MobilePhones");
		samsung ="U R Selected Samsung Mobile";
		new OrderPage(samsung);
	}

	
	
	public void selectRealme() {
		System.out.println("Your selected Realme Mobile");
	}

	
	
	public void selectOppo() {
		System.out.println("Your selected Oppo Mobile");
	}
	
	

	public void selectLenovo() {
		System.out.println("Your selected Lenovo Mobile");
	}
	
	
}
