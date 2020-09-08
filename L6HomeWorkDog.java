package ua.itea.lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class L6HomeWorkDog {
	public static void main(String[] args) {
		int health = 100;
		int counter = 0;
//		int modifier1 = 40;
//		int modifier2 = 40;
		char temp;
		int x = 0;
		int y = 0;
		char[][] arr = { { '@', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' },
				{ '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' } };
		System.out.println("Start");

		
		for (int i = 0; i < arr.length; i++) {
			int a = (int) (Math.random() * 9 + 1);
			int b = (int) (Math.random() * 9 + 1);
			
			for (int j = 0; j < arr.length; j++) {
				arr[i][a] = '*';
				arr[i][b] = '+';
				if (arr[x][y] == arr[i][a]) {
					System.out.println("yes");
				}
		}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(Arrays.toString(arr[j]));
			System.out.println();
		}
		System.out.println("Starting HP: " + health);

		do {
			Scanner move = new Scanner(System.in);
			char ch = move.nextLine().charAt(0);
			
			switch (ch) {
			case ('d'):
				temp = arr[x][y];
				arr[x][y] = arr[x][y + 1];
				arr[x][y + 1] = temp;
				y++;
				System.out.println(y);
				System.out.println(arr[x][y]);
				break;
			case ('a'):
				temp = arr[x][y];
				arr[x][y] = arr[x][y - 1];
				arr[x][y - 1] = temp;
				y--;
				break;

			case ('w'):
				temp = arr[x - 1][y];
				temp = arr[x][y];
				arr[x][y] = arr[x - 1][y];
				arr[x - 1][y] = temp;
				x--;
				System.out.println(x);
				break;
			case ('s'):
				temp = arr[x + 1][y];
				temp = arr[x][y];
				arr[x][y] = arr[x + 1][y];
				arr[x + 1][y] = temp;
				x++;
				System.out.println(x);
				break;
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(Arrays.toString(arr[j]));
				System.out.println();
			}
			counter++;
			health = health - (counter / counter + 4);
			System.out.println("HP: " + health);
			System.out.println("Number of steps: " + counter);

		} while (true);
	
	}
}

