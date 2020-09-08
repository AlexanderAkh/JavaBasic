package ua.itea.lesson2;

public class L2HomeWork {

	public static void main(String[] args) {
		int MyFunds = 24; 
		int beer1 = 65;
		int beer2 = 55;
		int beer3 = 45;
		int beer4 = 30;
		int beer5 = 7;
		
		if (MyFunds < beer5){
			System.out.println("No beer"); 
			}
		else if (MyFunds >= beer1) {
			System.out.println("Buy beer1");
		}
		else if (MyFunds >= beer2 && MyFunds < beer1) {
			System.out.println("Buy beer2");
		}
		else if (MyFunds >= beer3 && MyFunds < beer2) {
			System.out.println("Buy beer3");
		}
		else if (MyFunds >= beer4 && MyFunds < beer3) {
			System.out.println("Buy beer4");
		}
		else {
			System.out.println("Buy beer 5");
		}
	}
}

		
		


