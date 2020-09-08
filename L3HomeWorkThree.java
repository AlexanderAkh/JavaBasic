package ua.itea.lesson3;

public class L3HomeWorkThree {
	// sum numbers in integer

	public static void main(String[] args) {
		int number1 = 123;
		int sum = 0;

		while (number1 > 0) {
			sum = sum + number1 % 10;
			number1 = number1 / 10;
		}
		System.out.println(sum);

	}
}			
