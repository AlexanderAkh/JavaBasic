package ua.itea.lesson4;

import java.util.Arrays;

public class L4HomeWork5 {

	public static void main(String[] args) {
//In original had few errors; int random was Initialized outside while loop
//index was not iterated in the brackets.		
		
		int arrSize = 10;
		byte[] bArr = new byte[arrSize];
		short[] sArr = new short[arrSize];
		int[] iArr = new int[arrSize];

		
		int bIndex = 0;
		int sIndex = 0;
		int iIndex = 0;
		int iterationCount = 0;

		while (bIndex < bArr.length || sIndex < sArr.length || iIndex < iArr.length) {
			int random = (int) (Math.random() * Integer.MAX_VALUE);
			if (bIndex < bArr.length && random <= Byte.MAX_VALUE) {
				bArr[bIndex++] = (byte) random;
			} else if (sIndex < sArr.length && random <= Short.MAX_VALUE) {
				sArr[sIndex++] = (short) random;
			} else if (iIndex < iArr.length && random <= Integer.MAX_VALUE) {
				iArr[iIndex++]= random;
			}
			iterationCount++;
		}
		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(iArr));
		System.out.println(iterationCount);
	}
}
