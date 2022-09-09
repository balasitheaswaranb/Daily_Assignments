package com.arrays;
public class GrandChildCount {

	public static void main(String[] args) {

		String Dim[][] = { { "luke", "wayne" }, { "wayne", "rooney" }, { "rooney", "ronaldo" }, { "shaw", "rooney" } };
		String fatherOfChild = "";
		int count = 0;
		String grandpa = "ronaldo";
		System.out.println("Find grand children of " + grandpa);
		for (int i = 0; i < Dim.length; i++) {
			if (Dim[i][1].equals(grandpa)) {
				fatherOfChild = Dim[i][0];
				break;
			}
		}
		for (int k = 0; k < Dim.length; k++) {
			if (Dim[k][1] == fatherOfChild) {
				count++;
			}
		}
		System.out.println("No of Grand children " + grandpa + " : " + count);
	}
}
