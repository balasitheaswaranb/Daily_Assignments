package com.dailylearning;

import java.util.Arrays;

public class Beautiful {
	public static void main(String args[]) {
		new Beautiful().init();
	}

	private void init() {
		String s = "ivvkx";
		char sChar[] = s.toCharArray();
		int[] sInt = new int[sChar.length];

		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		String r = s1.toString();
		char sChar1[] = r.toCharArray();
		int[] sInt1 = new int[sChar1.length];

		for (int i = 0; i < sChar.length; i++) {
			sInt[i] = sChar[i];
		}
		for (int i = 0; i < sChar1.length; i++) {
			sInt1[i] = sChar1[i];
		}
		int count[] = new int[sInt.length - 1];
		for (int i = 0; i < sInt.length - 1; i++) {
			count[i] = sInt[i + 1] - sInt[i];
		}
		int count1[] = new int[sInt1.length - 1];
		for (int i = 0; i < sInt1.length - 1; i++) {
			count1[i] = sInt1[i] - sInt1[i + 1];
		}
		Arrays.sort(count);
		Arrays.sort(count1);
		if (Arrays.equals(count, count1)) {
			System.out.println("Yes");
		} else
			System.out.println("no");
	}
}
