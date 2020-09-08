package ua.itea.lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class L6homeWork1 {

	public static void main(String[] args) {
		String[] string = new String[2];
		Scanner in = new Scanner(System.in);
		int sentenceNumber = 1;
		int wordCount1 = 0;
		int wordCount2 = 0;
		int cCount = 0;
		int cCount2 = 0;

		for (int i = 0; i < string.length; i++) {
			System.out.println("Enter String #: " + sentenceNumber + ".");
			String sentence = in.nextLine();
			string[i] = sentence;
			sentenceNumber++;
			if (i == 0) {
				String[] words = sentence.split(("\\W+"));
				wordCount1 = words.length;
			} else {
				String[] words = sentence.split(("\\W+"));
				wordCount2 = words.length;
			}
		}

		if (string[0].length() > string[1].length()) {
			System.out.println("String # 1 is longer than # 2");
		} else if (string[0].length() < string[1].length()) {
			System.out.println("String # 2 is longer than # 1");
		} else {
			System.out.println("String # 1 is equal in length to # 2");
		}

		if (wordCount1 > wordCount2) {
			System.out.println("String # 1 with " + wordCount1 + " words, has more words than # 2");
		} else if (wordCount1 < wordCount2) {
			System.out.println("String # 2 with " + wordCount2 + " words, has more words than # 1");
		} else {
			System.out.println("String # 1 has equal number of words with String # 2");
		}

		String s1 = string[0];
		for (int j = 0; j < s1.length(); j++) {
			if (s1.charAt(j) == 'a' || s1.charAt(j) == 'e' || s1.charAt(j) == 'i' || s1.charAt(j) == 'o'
					|| s1.charAt(j) == 'u') {

			} else if (s1.charAt(j) >= 'a' && s1.charAt(j) <= 'z') {
				cCount++;
			}
		}

		String s2 = string[1];
		for (int k = 0; k < s1.length(); k++) {
			if (s2.charAt(k) == 'a' || s2.charAt(k) == 'e' || s1.charAt(k) == 'i' || s2.charAt(k) == 'o'
					|| s2.charAt(k) == 'u') {
			} else if (s2.charAt(k) >= 'a' && s2.charAt(k) <= 'z') {
				cCount2++;
			}
		}
		System.out.println("Number of consonants in sentence #1: " + cCount);
		System.out.println("Number of consonants in sentence #2: " + cCount2);
	}
}
