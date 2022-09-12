package com.zsgs.assignment;

public class Swap_Using_Bitwise {
	public static void main(String ar[])
	{
		int x=5,y=10;
		System.out.println("The before swapping : x = "+x+" y = "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("The swapped values are : x = "+x+" y = "+y);
	}
}

