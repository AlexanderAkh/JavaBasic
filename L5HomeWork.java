package ua.itea.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class L5HomeWork {

	public static void main(String[] args) {

		char[] arr = { '@', '_', '_', '_', '_', '_', '_', '_', '_', '_' };

		int a = (int) (Math.random() * 9 + 1);
		int b = (int) (Math.random() * 9 + 1);

		arr[a] = '*';
		arr[b] = '+';
		int modifier = 40;
		int modifier2 = 40;
		char temp;
		int i = 0;
		int health = 100;
		int counter = 0;
		System.out.println("Start");
		System.out.println(arr);
		
	
		do {
			@SuppressWarnings("resource")
			Scanner move = new Scanner(System.in);
			char ch = move.next().charAt(0);
			counter++;
			health = health - (counter / counter + 4);
			if (ch == 'd') {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i++;
				System.out.println(arr);
				if (arr[i] == arr[a]) {
					health = health - modifier;
					modifier = 0;
				} else if (arr[i] == arr[b]) {
					health = health + modifier2;
					modifier2 = 0;
				}
				if (i == arr.length - 1 || health == 0) {
					System.out.println("Game Over");

				}
			} else if (ch == 'a') {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				i--;
				System.out.println(arr);
				if (i == 0 || health == 0) {
					System.out.println("Game Over");

				}
			}
			System.out.println("Healt " + health + " HP");
		} while (i > 0 && i != 0);

	}
}
