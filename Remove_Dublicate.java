package com.zsgs.assignment;

public class Remove_Dublicate {
public static void main(String args[]) {
	int[] arr = {1,1,2,2,3,3,5,5,9};
	int separate = 0;
	for(int i=0;i<arr.length;i++) {
		 separate = separate ^ arr[i];
		 if(separate!=0)
		 System.out.print(separate+" ");
	}
	

}
}
