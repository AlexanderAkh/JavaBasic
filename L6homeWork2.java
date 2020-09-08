package ua.itea.lesson6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import org.omg.CORBA.Object;

public class L6homeWork2 {

	public static void main(String[] args) {
		String[][] arr = new String[3][3];
		String[] input = { "last name", "middle name", "first name" };
		Scanner in = new Scanner(System.in);
		System.out.println(Arrays.deepToString(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Record: # " + (i + 1));
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Please enter your " + input[j]);
				String name = in.nextLine();
				arr[i][j] = name;
			}
			System.out.println("------------------------------------------");
			System.out.println(Arrays.deepToString(arr));
		}
	
		System.out.println("Please enter the query");
		String search = in.nextLine();

		for (int j = 0; j < arr.length; j++) {
			String s1 = Arrays.toString(arr[j]).toLowerCase();
			if (s1.contains(search)) {
				System.out.println("Result is: " + s1);
			}
		}
	}
}
