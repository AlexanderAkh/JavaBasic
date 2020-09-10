package ua.itea.lesson8HomeWork;

import java.util.Scanner;

public class Agregator {
	public void setId(int id) {
		if (id == 1) {
			Rct rct = new Rct();
			rct.printInfo();
		} else if (id == 2) {
			Trng trng = new Trng();
			trng.printInfo();
		} else if (id == 3) {
			Circle circle = new Circle();
			circle.printInfo();
		} else if (id == 0) {
			System.out.println("exit");
		}
	}
	
	public void getText() {
		System.out.println("Press 1 for rectangle" +"\n"
						 + "Press 2 for triangle" + "\n" 
						 + "Press 3 for circle" + "\n" 
						 + "Press 0 to exit");
	}
	
	public void userInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Agregator aggregator = new Agregator();
		int id = 0;
		do {
			id = scanner.nextInt();
			aggregator.setId(id);
		} while (id != 0);

	}
}
