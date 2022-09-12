package com.zsgs.assignment;

import java.util.Scanner;

public class Check_Odd_Even {
   public static void check(int num)
	       {
	           if((num & 1)==1)
	                System.out.println(num+" is Odd number");
	           else 
	                System.out.println(num+" is Even number");
	        }
	      public static void main(String ar[])
	      {
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("Enter a number =");
	    	  int num=sc.nextInt();
	    	  check(num);
	           sc.close();
	      }
	 }

