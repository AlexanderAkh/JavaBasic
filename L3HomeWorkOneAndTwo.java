package ua.itea.lesson3;

public class L3HomeWorkOneAndTwo {
	

		public static void main(String[] args) {
			int money = 234;
			int discount = 7;

			if (money < 300) {
				discount = 0;
			} else if (money < 400) {
				discount = 3;
			} else if (money < 500) {
				discount = 5;
			}

			//System.out.println("Your discount is " + discount + "%, total to pay: " + (money - (money / 100) * discount));
			// -------------------------------------

			switch (money / 100) {
			case 0:
			case 1:
			case 2:
				discount = 0;
				break;
			case 3:
				discount = 3;
				break;
			case 4:
				discount = 5;
				break;
			default:
				discount = 7;
			}
			System.out.println("Your discount is " + discount + "%, total to pay: " + (money - (money / 100) * discount));
			
		}

}



	

