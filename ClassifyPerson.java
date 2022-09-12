package com.zsgs.assignment;

public class ClassifyPerson {
	public static void main(String arg[]) {
		int age = 35;
		char gender = 'F'; // M - Male, F - Female
		if (age > 25) {
			if (gender == 'M') 
			{
				System.out.println("Man");
			} else {
				System.out.println("Woman");
			}
		} else {
			if (gender == 'M'){
				System.out.println("Boy");
			} else {
				System.out.println("Girl");
			}
		}
	}
}
