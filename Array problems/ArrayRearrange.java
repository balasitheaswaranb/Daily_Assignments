package com.arrays;

import java.util.Arrays;

public class ArrayRearrange {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 1, 4, 5, 6, 8, 8 };
		int arr2[] = new int[arr1.length];
		Arrays.sort(arr1);
		int len = arr1.length;
		int i = 0, j = len - 1, k = 0;
		if (len % 2 == 0) {
			while (i < j) {
				arr2[k++] = arr1[j--];
				arr2[k++] = arr1[i++];
			}
		} else {
			while (i < j) {
				arr2[k++] = arr1[i++];
				arr2[k++] = arr1[j--];
			}
		}
		if (len % 2 != 0) {
			arr2[k++] = arr1[i];
		}
		for (i = arr2.length - 1; i >= 0; i--) {
			System.out.print(arr2[i] + " ");
		}
	}
}
