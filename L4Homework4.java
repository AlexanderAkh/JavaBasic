package ua.itea.lesson4;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;

public class L4Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array4 = { 'A', 'F', 'B', 'C', 'B', 'F', 'A' };
		boolean palindrome = true;
		for (int i = 0; i < array4.length / 2; i++) {
			if (array4[i] != array4[array4.length - 1 - i]) {
				palindrome = false;
				break;
			} //original version
			if (palindrome = true) {
				System.out.println("Is a palindrome");
				break;
			}
			else {
				System.out.println("Not a palindrome");
				break;
			}
		}
		 
		//Correct version from homework discussion
		System.out.println(palindrome ? "yeap" : "nope");
	}
}
		
