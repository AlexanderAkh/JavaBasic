package ua.itea.lesson4;

public class L4Homework2 {

	public static void main(String[] args) {
		int[] array3 = new int[(int) (Math.random() * 7 + 8)];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = ((int) (Math.random() * 100));
			System.out.println(array3[i]);
		}

	}

}
