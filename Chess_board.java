package com.zsgs.assignment;

import java.math.BigInteger;

public class Chess_board {
	 public static BigInteger solve(BigInteger num,int limit) {
		 if(limit != 1)
		 return  num.add(solve(num.add(num),limit-1));
		 else
		 return num;
	 }
	 public static void main (String args[]) {
		 System.out.println(solve(BigInteger.valueOf(1),64));
  }
}
