package Practice;

public class KiranamShop {

	
	
	
	
	public static String ChipsPocket(int Cash) {
		if (Cash < 10) {
			return "Minumum Amount 10rs";
		} else {
			int ChipsPocketss = Cash / 10;
			int ReamingAmount = Cash % 10;
			String message =  ChipsPocketss + "P Chips pocket tesukondi rs:";
			if (ReamingAmount != 0) {
				message= message + ReamingAmount +" Chillara tesukondi";
			}
			return message;
		}
	}
	
	
	
	
	
}
