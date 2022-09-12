package com.arrays;

import java.util.Scanner;

public class MatricsMultiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows1 = scan.nextInt();
		int columns1 = scan.nextInt();
		int rows2 = scan.nextInt();
		int columns2 = scan.nextInt();
		int array1[][] = new int[rows1][columns1];
		int array2[][] = new int[rows2][columns2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				array1[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				array2[i][j] = scan.nextInt();
			}
		}
		if (columns1 != rows2) {
			System.out.println("Matrix Multiplication is Not Possible");
		}

		int array3[][] = new int[rows1][columns2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < rows2; k++)
					array3[i][j] += array1[i][k] * array2[k][j];
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
			scan.close();
		}
	}
}
