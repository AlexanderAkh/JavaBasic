package ua.itea.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class L4HomeWork3 {
	public static void main(String[] args) {
		int arrayLength = 0;
		Scanner scanner = new Scanner(System.in);
		{
			do {
				System.out.println("PLease enter desired array length");
				if (scanner.hasNextInt()) {
					arrayLength = scanner.nextInt();
					break;
				} else {
					System.out.println("Please input whole number.");
					scanner.next();
				}
			} while (true);

			int[] array4 = new int[arrayLength];

			for (int i = 0; i < array4.length; i++) {
				Scanner scanner2 = new Scanner(System.in);
				do {
					System.out.println("PLease enter the whole digit");
					if (scanner2.hasNextInt()) {
						array4[i] = scanner2.nextInt();
						break;
					} else {
						System.out.println("Wrong!");
						scanner2.next();
					}

				} while (true);
			}
			// tests
			{

				System.out.println("test: length of array = " + array4.length);
				for (int i = 0; i < array4.length; i++) {
					System.out.println("test: of index" + i + " = " + array4[0]);
				}

			}
			System.out.println(Arrays.toString(array4));
		}
	}
}