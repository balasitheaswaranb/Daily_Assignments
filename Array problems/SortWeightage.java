package com.arrays;

public class SortWeightage {
	public static boolean isSquare(int num) {
		double number = Math.sqrt(num);
		if (number - Math.floor(number) == 0) {
			return true;
		}
		return false;
	}

	public static boolean isMultiple(int num) {
		if (num % 4 == 0 && num % 6 == 0)
			return true;
		else
			return false;
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 49, 36, 8, 10, 12 };

		int temp = 0;

		for (int num : arr) {
			temp = 0;
			if (isSquare(num)) {
				temp += 5;
			}
			if (isMultiple(num)) {
				temp += 4;
			}
			if (isEven(num)) {
				temp += 3;
			}

			System.out.println(num + " " + temp);
		}
	}
}
