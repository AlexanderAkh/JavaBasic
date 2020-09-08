package ua.itea.lesson4;

import java.util.Arrays;

public class L4Homework1 {
	public static void main(String[] args) {
		//Original solution
		int[] array = new int[12];
		for (int i = 0; i < array.length; i++) {
			if ((i % 2 == 0 && i <= 6) || (i % 2 != 0 && i >= 7)) {
				array[i] = 31;
			} else if (i == 1) {
				array[i] = 28;
			} else {
				array[i] = 30;
			}
		}
		System.out.println(Arrays.toString(array));

		//Correct solution after discussing homework
		for (int i = 0; i < array.length; i++)
			array[i] = ((i % 2 == 0 && i <= 6) || i % 2 != 0 && i >= 6) ? 31 : (i == 1 ? 28 : 30);
		{
			System.out.println(Arrays.toString(array));
		}

	}

}
